﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
#Event: LoadedModel (Success As Boolean)
#Event: TrainedModel
#Event: StartedMusic

Sub Class_Globals
	Private BANano As BANano 'ignore
	Private X() As Int
	Private Y() As Int
	
	Public modelName() As String
	Private mCallBack As Object
	Private mEventName As String
	Private model As Object
	Private Player As Object
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(mBANano As BANano, callBack As Object, EventName As String)
	BANano=mBANano
	mCallBack=callBack
	mEventName=EventName
	modelName=Array As String("trio_4bar_lokl_small_q1", "drums_2bar_lokl_small", "drums_2bar_hikl_small", "drums_2bar_nade_9_q2", _
    "drums_4bar_med_q2", "mel_2bar_small", "mel_4bar_med_q2", "mel_4bar_med_lokl_q2", "mel_4bar_small_q2", _
    "mel_chords", "mel_16bar_small_q2", "trio_4bar_lokl_small_q1", "multitrack", "multitrack_med", "multitrack_med_fb256", _
    "multitrack_chords", "groovae_2bar_humanize", "tap2drum_1bar", "tap2drum_2bar", "tap2drum_3bar", "tap2drum_4bar", "groovae_4bar", _
    "basic_rnn", "melody_rnn", "drum_kit_rnn", "chord_pitches_improv", "onsets_frames_uni", "onsets_frames_uni_q2", _
    "ddsp_flute", "ddsp_tenor_saxophone", "ddsp_trumpet", "ddsp_violin")
	
	Player=BANano.RunInlineJavascriptMethod("creaplayer",Null)
End Sub

Public Sub SetDataX(xData() As Int)
	X=xData
End Sub

Public Sub SetDataY(yData() As Int)
	Y=yData
End Sub

' example
' TS.SetDataX(Array As Int(1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,22))
' TS.SetDatay(Array As Int(1, 4, 9, 16, 25, 36, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484))
' TS.Predict(7,"predict") 
Public Sub Training
	model=BANano.RunInlineJavascriptMethod("generatemodel", Null)
	BANano.RunInlineJavascriptMethod("train", Array(Me,model, X,X.Length,Y,Y.Length))
	
End Sub

Public Sub MusicGenerate(MusicModelName As String)
	model=BANano.RunInlineJavascriptMethod("generatemusicmodel", Array(MusicModelName))
End Sub

Public Sub PlayMusic
	BANano.RunInlineJavascriptMethod("playmusicmodel", Array(Player,model,Me))
End Sub

Public Sub StopMusic
	BANano.RunInlineJavascriptMethod("stopplayer", Array(Player))
End Sub

Public Sub Predict(value As Int) As Double
	Return BANano.RunInlineJavascriptMethod("prediction", Array(model, value))
End Sub

Public Sub LoadModelFromLocalSorage
	BANano.RunInlineJavascriptMethod("loadmodel", Array(Me))
End Sub

Public Sub SaveModelToLocalSorage
	BANano.RunInlineJavascriptMethod("avemodel", Array(Me,model))
End Sub

Private Sub model_ready(modr As Object)
	model=modr
	If BANano.SubExists(mCallBack,mEventName & "_TrainedModel") Then BANano.CallSub(mCallBack,mEventName & "_TrainedModel",Null)
End Sub

Private Sub load_model(Success As Boolean, nmod As Object)
	If Success Then model=nmod	
	If BANano.SubExists(mCallBack,mEventName & "_LoadedModel") Then BANano.CallSub(mCallBack,mEventName & "_LoadedModel",Array(Me,Success))
End Sub

Private Sub started_music
	If BANano.SubExists(mCallBack,mEventName & "_StartedMusic") Then BANano.CallSub(mCallBack,mEventName & "_StartedMusic",Array(Me))
End Sub

#IF Javascript
function generatemodel() {
	const model = tf.sequential();
    model.add(tf.layers.dense({ units: 64, activation: 'relu', inputShape: [1] }));
    model.add(tf.layers.dense({units: 1, inputShape: [1]}));
	return model;
}

function generatemusicmodel(modelName) {
	const model = new mm.MusicVAE('https://storage.googleapis.com/download.magenta.tensorflow.org/tfjs_checkpoints/music_vae/' + modelName);
	window.console.log(model);
	return model;
}

function creaplayer() {
	const player = new mm.Player();
	return player;
}

function stopplayer(player) {
	player.stop(); 
}

function playmusicmodel(player,model,objcallback) {
	//const player = new mm.Player();

	 const startPlayback = () => {
        model.initialize().then(() => {
            // call function
	  		method="started_music";
	  		objcallback[method]();

            function sampleAndPlay() {
                model.sample(1) // Genera una sequenza musicale
                    .then((samples) => player.start(samples[0])) // Riproduce la sequenza generata
                    .then(sampleAndPlay) // Continua a generare e riprodurre in loop
                    .catch(error => console.error("Error during sampling or playing", error));
            }
            sampleAndPlay(); // Avvia la riproduzione ricorsiva
        });
    };
	
	// Assicura che l'AudioContext sia ripreso in base a una precedente interazione utente
    if (mm.Player.tone.context.state === 'suspended') {
        mm.Player.tone.context.resume().then(() => {
            console.log('Audio context resumed.');
            startPlayback(); // Avvia la riproduzione
        });
    } else {
        startPlayback(); // Avvia la riproduzione
    }
}

function train(objcallback,model, xx, nx , yy , ny) {
    model.compile({loss: 'meanSquaredError', optimizer: 'adam'});

    // Generate some synthetic data for training.
    // Training data with 20 values excluding 7
	const xs = tf.tensor2d(xx, [nx, 1]);
    const ys = tf.tensor2d(yy, [ny, 1]);

    // Train the model using the data.
    model.fit(xs, ys, {epochs: 350}).then(() => {
      // Use the model to do inference on a data point the model hasn't seen before:

      // call function
	  method="model_ready";
	  objcallback[method](model);
      //document.getElementById(idel).innerText =  'Predict: ' + model.predict(tf.tensor2d([bs], [1, 1])).dataSync()[0];
    });
}

function prediction(model, bs) {
	value = model.predict(tf.tensor2d([bs], [1, 1])).dataSync()[0];
	return value;
}

async function loadmodel(objcallback) {
	try {
		// Load the model from localstorage or a URL (in this case from the download directory)
		model = await tf.loadLayersModel('localstorage://my-model');
		//model = await tf.loadLayersModel('downloads://my-model');
		method="model_ready";
		objcallback[method](true,model);
	} catch (error) {
		objcallback[method](false,null);
	}
}

async function savemodel(objcallback, model) {
     if (!model) {
          alert('No model trained yet. Train the model first.');
          return;
     }

     try {
          // Save the model locally
          //await model.save('downloads://my-model');
          await model.save('localstorage://my-model');
          alert('Model saved successfully!');
     } catch (error) {
          alert('Error saving the model: ' + error.message);
     }
}
#End If