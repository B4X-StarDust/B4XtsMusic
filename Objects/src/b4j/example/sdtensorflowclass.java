package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class sdtensorflowclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.sdtensorflowclass", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.sdtensorflowclass.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANano _banano = null;
public int[] _x = null;
public int[] _y = null;
public String[] _modelname = null;
public Object _mcallback = null;
public String _meventname = "";
public Object _model = null;
public Object _player = null;
public b4j.example.main _main = null;
public String  _musicgenerate(b4j.example.sdtensorflowclass __ref,String _musicmodelname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "musicgenerate", false))
	 {return ((String) Debug.delegate(ba, "musicgenerate", new Object[] {_musicmodelname}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub MusicGenerate(MusicModelName As String)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="model=BANano.RunInlineJavascriptMethod(\"generatem";
__ref._model /*Object*/  = __ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("generatemusicmodel",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_musicmodelname)}));
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public String  _playmusic(b4j.example.sdtensorflowclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "playmusic", false))
	 {return ((String) Debug.delegate(ba, "playmusic", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub PlayMusic";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="BANano.RunInlineJavascriptMethod(\"playmusicmodel\"";
__ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("playmusicmodel",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._player /*Object*/ ,__ref._model /*Object*/ ,this}));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.sdtensorflowclass __ref,anywheresoftware.b4a.BA _ba,com.ab.banano.BANano _mbanano,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mbanano,_callback,_eventname}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub Initialize(mBANano As BANano, callBack";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="BANano=mBANano";
__ref._banano /*com.ab.banano.BANano*/  = _mbanano;
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="mCallBack=callBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="mEventName=EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="modelName=Array As String(\"trio_4bar_lokl_small_q";
__ref._modelname /*String[]*/  = new String[]{"trio_4bar_lokl_small_q1","drums_2bar_lokl_small","drums_2bar_hikl_small","drums_2bar_nade_9_q2","drums_4bar_med_q2","mel_2bar_small","mel_4bar_med_q2","mel_4bar_med_lokl_q2","mel_4bar_small_q2","mel_chords","mel_16bar_small_q2","trio_4bar_lokl_small_q1","multitrack","multitrack_med","multitrack_med_fb256","multitrack_chords","groovae_2bar_humanize","tap2drum_1bar","tap2drum_2bar","tap2drum_3bar","tap2drum_4bar","groovae_4bar","basic_rnn","melody_rnn","drum_kit_rnn","chord_pitches_improv","onsets_frames_uni","onsets_frames_uni_q2","ddsp_flute","ddsp_tenor_saxophone","ddsp_trumpet","ddsp_violin"};
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="Player=BANano.RunInlineJavascriptMethod(\"creaplay";
__ref._player /*Object*/  = __ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("creaplayer",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="End Sub";
return "";
}
public String  _stopmusic(b4j.example.sdtensorflowclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "stopmusic", false))
	 {return ((String) Debug.delegate(ba, "stopmusic", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub StopMusic";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="BANano.RunInlineJavascriptMethod(\"stopplayer\", Ar";
__ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("stopplayer",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._player /*Object*/ }));
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.sdtensorflowclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Private BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Private X() As Int";
_x = new int[(int) (0)];
;
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Private Y() As Int";
_y = new int[(int) (0)];
;
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Public modelName() As String";
_modelname = new String[(int) (0)];
java.util.Arrays.fill(_modelname,"");
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="Private model As Object";
_model = new Object();
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Private Player As Object";
_player = new Object();
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="End Sub";
return "";
}
public String  _load_model(b4j.example.sdtensorflowclass __ref,boolean _success,Object _nmod) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "load_model", false))
	 {return ((String) Debug.delegate(ba, "load_model", new Object[] {_success,_nmod}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Private Sub load_model(Success As Boolean, nmod As";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If Success Then model=nmod";
if (_success) { 
__ref._model /*Object*/  = _nmod;};
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="If BANano.SubExists(mCallBack,mEventName & \"_Load";
if (__ref._banano /*com.ab.banano.BANano*/ .SubExists(__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LoadedModel")) { 
__ref._banano /*com.ab.banano.BANano*/ .CallSub(__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LoadedModel",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{this,(Object)(_success)}));};
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="End Sub";
return "";
}
public String  _loadmodelfromlocalsorage(b4j.example.sdtensorflowclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "loadmodelfromlocalsorage", false))
	 {return ((String) Debug.delegate(ba, "loadmodelfromlocalsorage", null));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub LoadModelFromLocalSorage";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="BANano.RunInlineJavascriptMethod(\"loadmodel\", Arr";
__ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("loadmodel",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{this}));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public String  _model_ready(b4j.example.sdtensorflowclass __ref,Object _modr) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "model_ready", false))
	 {return ((String) Debug.delegate(ba, "model_ready", new Object[] {_modr}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub model_ready(modr As Object)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="model=modr";
__ref._model /*Object*/  = _modr;
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="If BANano.SubExists(mCallBack,mEventName & \"_Trai";
if (__ref._banano /*com.ab.banano.BANano*/ .SubExists(__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TrainedModel")) { 
__ref._banano /*com.ab.banano.BANano*/ .CallSub(__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TrainedModel",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));};
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="End Sub";
return "";
}
public double  _predict(b4j.example.sdtensorflowclass __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "predict", false))
	 {return ((Double) Debug.delegate(ba, "predict", new Object[] {_value}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub Predict(value As Int) As Double";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Return BANano.RunInlineJavascriptMethod(\"predicti";
if (true) return (double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("prediction",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__ref._model /*Object*/ ,(Object)(_value)}))));
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return 0;
}
public String  _savemodeltolocalsorage(b4j.example.sdtensorflowclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "savemodeltolocalsorage", false))
	 {return ((String) Debug.delegate(ba, "savemodeltolocalsorage", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub SaveModelToLocalSorage";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="BANano.RunInlineJavascriptMethod(\"avemodel\", Arra";
__ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("avemodel",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{this,__ref._model /*Object*/ }));
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return "";
}
public String  _setdatax(b4j.example.sdtensorflowclass __ref,int[] _xdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "setdatax", false))
	 {return ((String) Debug.delegate(ba, "setdatax", new Object[] {_xdata}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub SetDataX(xData() As Int)";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="X=xData";
__ref._x /*int[]*/  = _xdata;
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
public String  _setdatay(b4j.example.sdtensorflowclass __ref,int[] _ydata) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "setdatay", false))
	 {return ((String) Debug.delegate(ba, "setdatay", new Object[] {_ydata}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub SetDataY(yData() As Int)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Y=yData";
__ref._y /*int[]*/  = _ydata;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public String  _started_music(b4j.example.sdtensorflowclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "started_music", false))
	 {return ((String) Debug.delegate(ba, "started_music", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub started_music";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If BANano.SubExists(mCallBack,mEventName & \"_Star";
if (__ref._banano /*com.ab.banano.BANano*/ .SubExists(__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_StartedMusic")) { 
__ref._banano /*com.ab.banano.BANano*/ .CallSub(__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_StartedMusic",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{this}));};
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return "";
}
public String  _training(b4j.example.sdtensorflowclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdtensorflowclass";
if (Debug.shouldDelegate(ba, "training", false))
	 {return ((String) Debug.delegate(ba, "training", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub Training";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="model=BANano.RunInlineJavascriptMethod(\"generatem";
__ref._model /*Object*/  = __ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("generatemodel",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="BANano.RunInlineJavascriptMethod(\"train\", Array(M";
__ref._banano /*com.ab.banano.BANano*/ .RunInlineJavascriptMethod("train",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{this,__ref._model /*Object*/ ,(Object)(__ref._x /*int[]*/ ),(Object)(__ref._x /*int[]*/ .length),(Object)(__ref._y /*int[]*/ ),(Object)(__ref._y /*int[]*/ .length)}));
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="End Sub";
return "";
}
}