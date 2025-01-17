package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sdtensorflowclass_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano 'ignore";
sdtensorflowclass._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",sdtensorflowclass._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private X() As Int";
sdtensorflowclass._x = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_x",sdtensorflowclass._x);
 //BA.debugLineNum = 8;BA.debugLine="Private Y() As Int";
sdtensorflowclass._y = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_y",sdtensorflowclass._y);
 //BA.debugLineNum = 10;BA.debugLine="Public modelName() As String";
sdtensorflowclass._modelname = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});__ref.setField("_modelname",sdtensorflowclass._modelname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object";
sdtensorflowclass._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",sdtensorflowclass._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String";
sdtensorflowclass._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",sdtensorflowclass._meventname);
 //BA.debugLineNum = 13;BA.debugLine="Private model As Object";
sdtensorflowclass._model = RemoteObject.createNew ("Object");__ref.setField("_model",sdtensorflowclass._model);
 //BA.debugLineNum = 14;BA.debugLine="Private Player As Object";
sdtensorflowclass._player = RemoteObject.createNew ("Object");__ref.setField("_player",sdtensorflowclass._player);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mbanano,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sdtensorflowclass","initialize", __ref, _ba, _mbanano, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mBANano", _mbanano);
Debug.locals.put("callBack", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(mBANano As BANano, callBack";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="BANano=mBANano";
Debug.ShouldStop(262144);
__ref.setField ("_banano" /*RemoteObject*/ ,_mbanano);
 BA.debugLineNum = 20;BA.debugLine="mCallBack=callBack";
Debug.ShouldStop(524288);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 21;BA.debugLine="mEventName=EventName";
Debug.ShouldStop(1048576);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="modelName=Array As String(\"trio_4bar_lokl_small_q";
Debug.ShouldStop(2097152);
__ref.setField ("_modelname" /*RemoteObject*/ ,RemoteObject.createNewArray("String",new int[] {32},new Object[] {BA.ObjectToString("trio_4bar_lokl_small_q1"),BA.ObjectToString("drums_2bar_lokl_small"),BA.ObjectToString("drums_2bar_hikl_small"),BA.ObjectToString("drums_2bar_nade_9_q2"),BA.ObjectToString("drums_4bar_med_q2"),BA.ObjectToString("mel_2bar_small"),BA.ObjectToString("mel_4bar_med_q2"),BA.ObjectToString("mel_4bar_med_lokl_q2"),BA.ObjectToString("mel_4bar_small_q2"),BA.ObjectToString("mel_chords"),BA.ObjectToString("mel_16bar_small_q2"),BA.ObjectToString("trio_4bar_lokl_small_q1"),BA.ObjectToString("multitrack"),BA.ObjectToString("multitrack_med"),BA.ObjectToString("multitrack_med_fb256"),BA.ObjectToString("multitrack_chords"),BA.ObjectToString("groovae_2bar_humanize"),BA.ObjectToString("tap2drum_1bar"),BA.ObjectToString("tap2drum_2bar"),BA.ObjectToString("tap2drum_3bar"),BA.ObjectToString("tap2drum_4bar"),BA.ObjectToString("groovae_4bar"),BA.ObjectToString("basic_rnn"),BA.ObjectToString("melody_rnn"),BA.ObjectToString("drum_kit_rnn"),BA.ObjectToString("chord_pitches_improv"),BA.ObjectToString("onsets_frames_uni"),BA.ObjectToString("onsets_frames_uni_q2"),BA.ObjectToString("ddsp_flute"),BA.ObjectToString("ddsp_tenor_saxophone"),BA.ObjectToString("ddsp_trumpet"),RemoteObject.createImmutable("ddsp_violin")}));
 BA.debugLineNum = 29;BA.debugLine="Player=BANano.RunInlineJavascriptMethod(\"creaplay";
Debug.ShouldStop(268435456);
__ref.setField ("_player" /*RemoteObject*/ ,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunInlineJavascriptMethod",(Object)(BA.ObjectToString("creaplayer")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), sdtensorflowclass.__c.getField(false,"Null"))));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_model(RemoteObject __ref,RemoteObject _success,RemoteObject _nmod) throws Exception{
try {
		Debug.PushSubsStack("load_model (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("load_model")) { return __ref.runUserSub(false, "sdtensorflowclass","load_model", __ref, _success, _nmod);}
Debug.locals.put("Success", _success);
Debug.locals.put("nmod", _nmod);
 BA.debugLineNum = 79;BA.debugLine="Private Sub load_model(Success As Boolean, nmod As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="If Success Then model=nmod";
Debug.ShouldStop(32768);
if (_success.<Boolean>get().booleanValue()) { 
__ref.setField ("_model" /*RemoteObject*/ ,_nmod);};
 BA.debugLineNum = 81;BA.debugLine="If BANano.SubExists(mCallBack,mEventName & \"_Load";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"SubExists",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LoadedModel")))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LoadedModel"))),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref,(_success)})))));};
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadmodelfromlocalsorage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadModelFromLocalSorage (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("loadmodelfromlocalsorage")) { return __ref.runUserSub(false, "sdtensorflowclass","loadmodelfromlocalsorage", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub LoadModelFromLocalSorage";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="BANano.RunInlineJavascriptMethod(\"loadmodel\", Arr";
Debug.ShouldStop(4);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunInlineJavascriptMethod",(Object)(BA.ObjectToString("loadmodel")),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref})))));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _model_ready(RemoteObject __ref,RemoteObject _modr) throws Exception{
try {
		Debug.PushSubsStack("model_ready (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("model_ready")) { return __ref.runUserSub(false, "sdtensorflowclass","model_ready", __ref, _modr);}
Debug.locals.put("modr", _modr);
 BA.debugLineNum = 74;BA.debugLine="Private Sub model_ready(modr As Object)";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="model=modr";
Debug.ShouldStop(1024);
__ref.setField ("_model" /*RemoteObject*/ ,_modr);
 BA.debugLineNum = 76;BA.debugLine="If BANano.SubExists(mCallBack,mEventName & \"_Trai";
Debug.ShouldStop(2048);
if (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"SubExists",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TrainedModel")))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TrainedModel"))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), sdtensorflowclass.__c.getField(false,"Null")));};
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _musicgenerate(RemoteObject __ref,RemoteObject _musicmodelname) throws Exception{
try {
		Debug.PushSubsStack("MusicGenerate (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("musicgenerate")) { return __ref.runUserSub(false, "sdtensorflowclass","musicgenerate", __ref, _musicmodelname);}
Debug.locals.put("MusicModelName", _musicmodelname);
 BA.debugLineNum = 50;BA.debugLine="Public Sub MusicGenerate(MusicModelName As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="model=BANano.RunInlineJavascriptMethod(\"generatem";
Debug.ShouldStop(262144);
__ref.setField ("_model" /*RemoteObject*/ ,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunInlineJavascriptMethod",(Object)(BA.ObjectToString("generatemusicmodel")),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_musicmodelname)}))))));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playmusic(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PlayMusic (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("playmusic")) { return __ref.runUserSub(false, "sdtensorflowclass","playmusic", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Public Sub PlayMusic";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="BANano.RunInlineJavascriptMethod(\"playmusicmodel\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunInlineJavascriptMethod",(Object)(BA.ObjectToString("playmusicmodel")),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {__ref.getField(false,"_player" /*RemoteObject*/ ),__ref.getField(false,"_model" /*RemoteObject*/ ),__ref})))));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _predict(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Predict (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("predict")) { return __ref.runUserSub(false, "sdtensorflowclass","predict", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 62;BA.debugLine="Public Sub Predict(value As Int) As Double";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Return BANano.RunInlineJavascriptMethod(\"predicti";
Debug.ShouldStop(1073741824);
if (true) return BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunInlineJavascriptMethod",(Object)(BA.ObjectToString("prediction")),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_model" /*RemoteObject*/ ),(_value)}))))));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savemodeltolocalsorage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SaveModelToLocalSorage (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("savemodeltolocalsorage")) { return __ref.runUserSub(false, "sdtensorflowclass","savemodeltolocalsorage", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Public Sub SaveModelToLocalSorage";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="BANano.RunInlineJavascriptMethod(\"avemodel\", Arra";
Debug.ShouldStop(64);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunInlineJavascriptMethod",(Object)(BA.ObjectToString("avemodel")),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref,__ref.getField(false,"_model" /*RemoteObject*/ )})))));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdatax(RemoteObject __ref,RemoteObject _xdata) throws Exception{
try {
		Debug.PushSubsStack("SetDataX (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setdatax")) { return __ref.runUserSub(false, "sdtensorflowclass","setdatax", __ref, _xdata);}
Debug.locals.put("xData", _xdata);
 BA.debugLineNum = 32;BA.debugLine="Public Sub SetDataX(xData() As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="X=xData";
Debug.ShouldStop(1);
__ref.setField ("_x" /*RemoteObject*/ ,_xdata);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdatay(RemoteObject __ref,RemoteObject _ydata) throws Exception{
try {
		Debug.PushSubsStack("SetDataY (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("setdatay")) { return __ref.runUserSub(false, "sdtensorflowclass","setdatay", __ref, _ydata);}
Debug.locals.put("yData", _ydata);
 BA.debugLineNum = 36;BA.debugLine="Public Sub SetDataY(yData() As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Y=yData";
Debug.ShouldStop(16);
__ref.setField ("_y" /*RemoteObject*/ ,_ydata);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _started_music(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("started_music (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("started_music")) { return __ref.runUserSub(false, "sdtensorflowclass","started_music", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Private Sub started_music";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="If BANano.SubExists(mCallBack,mEventName & \"_Star";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"SubExists",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_StartedMusic")))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_StartedMusic"))),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref})))));};
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopmusic(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopMusic (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("stopmusic")) { return __ref.runUserSub(false, "sdtensorflowclass","stopmusic", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub StopMusic";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="BANano.RunInlineJavascriptMethod(\"stopplayer\", Ar";
Debug.ShouldStop(67108864);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunInlineJavascriptMethod",(Object)(BA.ObjectToString("stopplayer")),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_player" /*RemoteObject*/ )})))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _training(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Training (sdtensorflowclass) ","sdtensorflowclass",2,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("training")) { return __ref.runUserSub(false, "sdtensorflowclass","training", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Public Sub Training";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="model=BANano.RunInlineJavascriptMethod(\"generatem";
Debug.ShouldStop(4096);
__ref.setField ("_model" /*RemoteObject*/ ,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunInlineJavascriptMethod",(Object)(BA.ObjectToString("generatemodel")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), sdtensorflowclass.__c.getField(false,"Null"))));
 BA.debugLineNum = 46;BA.debugLine="BANano.RunInlineJavascriptMethod(\"train\", Array(M";
Debug.ShouldStop(8192);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunInlineJavascriptMethod",(Object)(BA.ObjectToString("train")),(Object)(sdtensorflowclass.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {__ref,__ref.getField(false,"_model" /*RemoteObject*/ ),(__ref.getField(false,"_x" /*RemoteObject*/ )),(__ref.getField(false,"_x" /*RemoteObject*/ ).getField(true,"length")),(__ref.getField(false,"_y" /*RemoteObject*/ )),(__ref.getField(false,"_y" /*RemoteObject*/ ).getField(true,"length"))})))));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}