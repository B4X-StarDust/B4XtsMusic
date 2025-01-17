package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pagehome extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pagehome", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pagehome.class).invoke(this, new Object[] {null});
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
public com.ab.banano.BANanoElement _melement = null;
public com.ab.banano.BANanoElement _playm = null;
public com.ab.banano.BANanoElement _stopm = null;
public b4j.example.sdtensorflowclass _ts = null;
public b4j.example.main _main = null;
public String  _initialize(b4j.example.pagehome __ref,anywheresoftware.b4a.BA _ba,com.ab.banano.BANano _nbanano) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pagehome";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_nbanano}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub Initialize(nBANano As BANano)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="BANano=nBANano";
__ref._banano /*com.ab.banano.BANano*/  = _nbanano;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.pagehome __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagehome";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="mElement = BANano.GetElement(\"#mainHolder\").Appen";
__ref._melement /*com.ab.banano.BANanoElement*/  = __ref._banano /*com.ab.banano.BANano*/ .GetElement("#mainHolder").Append((Object)(("<label><B>AI MUSIC GENERATION</B></label><br><br>")));
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="PlayM = BANano.GetElement(\"#mainHolder\").Append($";
__ref._playm /*com.ab.banano.BANanoElement*/  = __ref._banano /*com.ab.banano.BANano*/ .GetElement("#mainHolder").Append((Object)(("<button id=\"music\" Type=\"button\" class=\"\">Generate</button><br><br>"))).Get((Object)("#music"));
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="StopM = BANano.GetElement(\"#mainHolder\").Append($";
__ref._stopm /*com.ab.banano.BANanoElement*/  = __ref._banano /*com.ab.banano.BANano*/ .GetElement("#mainHolder").Append((Object)(("<button id=\"stop\" Type=\"button\"> Stop </button><br><br>"))).Get((Object)("#stop"));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="BANano.GetElement(\"#mainHolder\").Append($\"<label";
__ref._banano /*com.ab.banano.BANano*/ .GetElement("#mainHolder").Append((Object)(("<label id=\"lab\"> - </label>")));
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="PlayM.HandleEvents(\"click\", Me, \"music_click\")";
__ref._playm /*com.ab.banano.BANanoElement*/ .HandleEvents("click",this,"music_click");
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="StopM.HandleEvents(\"click\", Me, \"stop_click\")";
__ref._stopm /*com.ab.banano.BANanoElement*/ .HandleEvents("click",this,"stop_click");
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="StopM.SetStyle($\"{ \"visibility\": \"hidden\"} \"$)";
__ref._stopm /*com.ab.banano.BANanoElement*/ .SetStyle(("{ \"visibility\": \"hidden\"} "));
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="TS.Initialize(BANano,Me,\"TS\")";
__ref._ts /*b4j.example.sdtensorflowclass*/ ._initialize /*String*/ (null,ba,__ref._banano /*com.ab.banano.BANano*/ ,this,"TS");
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.pagehome __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagehome";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Private BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Private mElement As BANanoElement";
_melement = new com.ab.banano.BANanoElement();
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Private PlayM As BANanoElement";
_playm = new com.ab.banano.BANanoElement();
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Private StopM As BANanoElement";
_stopm = new com.ab.banano.BANanoElement();
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Private TS As SDtensorflowClass";
_ts = new b4j.example.sdtensorflowclass();
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="End Sub";
return "";
}
public String  _music_click(b4j.example.pagehome __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagehome";
if (Debug.shouldDelegate(ba, "music_click", false))
	 {return ((String) Debug.delegate(ba, "music_click", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub music_click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="TS.MusicGenerate(TS.modelName(0))";
__ref._ts /*b4j.example.sdtensorflowclass*/ ._musicgenerate /*String*/ (null,__ref._ts /*b4j.example.sdtensorflowclass*/ ._modelname /*String[]*/ [(int) (0)]);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="BANano.GetElement(\"#lab\").SetText($\"WAIT \"$)";
__ref._banano /*com.ab.banano.BANano*/ .GetElement("#lab").SetText(("WAIT "));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="TS.PlayMusic";
__ref._ts /*b4j.example.sdtensorflowclass*/ ._playmusic /*String*/ (null);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return "";
}
public String  _stop_click(b4j.example.pagehome __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagehome";
if (Debug.shouldDelegate(ba, "stop_click", false))
	 {return ((String) Debug.delegate(ba, "stop_click", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub stop_click";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="TS.StopMusic";
__ref._ts /*b4j.example.sdtensorflowclass*/ ._stopmusic /*String*/ (null);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="BANano.GetElement(\"#lab\").SetText($\"-\"$)";
__ref._banano /*com.ab.banano.BANano*/ .GetElement("#lab").SetText(("-"));
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="StopM.SetStyle($\"{ \"visibility\": \"hidden\"} \"$)";
__ref._stopm /*com.ab.banano.BANanoElement*/ .SetStyle(("{ \"visibility\": \"hidden\"} "));
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="End Sub";
return "";
}
public String  _ts_startedmusic(b4j.example.pagehome __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pagehome";
if (Debug.shouldDelegate(ba, "ts_startedmusic", false))
	 {return ((String) Debug.delegate(ba, "ts_startedmusic", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub TS_StartedMusic";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="StopM.SetStyle($\"{ \"visibility\": \"visible\"} \"$)";
__ref._stopm /*com.ab.banano.BANanoElement*/ .SetStyle(("{ \"visibility\": \"visible\"} "));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="BANano.GetElement(\"#lab\").SetText($\"Started\"$)";
__ref._banano /*com.ab.banano.BANano*/ .GetElement("#lab").SetText(("Started"));
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="End Sub";
return "";
}
}