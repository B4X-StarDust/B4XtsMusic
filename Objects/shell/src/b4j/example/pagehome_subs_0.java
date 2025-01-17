package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pagehome_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private BANano As BANano 'ignore";
pagehome._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",pagehome._banano);
 //BA.debugLineNum = 4;BA.debugLine="Private mElement As BANanoElement";
pagehome._melement = RemoteObject.createNew ("com.ab.banano.BANanoElement");__ref.setField("_melement",pagehome._melement);
 //BA.debugLineNum = 5;BA.debugLine="Private PlayM As BANanoElement";
pagehome._playm = RemoteObject.createNew ("com.ab.banano.BANanoElement");__ref.setField("_playm",pagehome._playm);
 //BA.debugLineNum = 6;BA.debugLine="Private StopM As BANanoElement";
pagehome._stopm = RemoteObject.createNew ("com.ab.banano.BANanoElement");__ref.setField("_stopm",pagehome._stopm);
 //BA.debugLineNum = 7;BA.debugLine="Private TS As SDtensorflowClass";
pagehome._ts = RemoteObject.createNew ("b4j.example.sdtensorflowclass");__ref.setField("_ts",pagehome._ts);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _nbanano) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pagehome) ","pagehome",1,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pagehome","initialize", __ref, _ba, _nbanano);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("nBANano", _nbanano);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(nBANano As BANano)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="BANano=nBANano";
Debug.ShouldStop(2048);
__ref.setField ("_banano" /*RemoteObject*/ ,_nbanano);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _music_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("music_click (pagehome) ","pagehome",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("music_click")) { return __ref.runUserSub(false, "pagehome","music_click", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Private Sub music_click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="TS.MusicGenerate(TS.modelName(0))";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ts" /*RemoteObject*/ ).runClassMethod (b4j.example.sdtensorflowclass.class, "_musicgenerate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ts" /*RemoteObject*/ ).getField(false,"_modelname" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 29;BA.debugLine="BANano.GetElement(\"#lab\").SetText($\"WAIT \"$)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#lab"))).runVoidMethod ("SetText",(Object)((RemoteObject.createImmutable("WAIT "))));
 BA.debugLineNum = 30;BA.debugLine="TS.PlayMusic";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ts" /*RemoteObject*/ ).runClassMethod (b4j.example.sdtensorflowclass.class, "_playmusic" /*RemoteObject*/ );
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (pagehome) ","pagehome",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "pagehome","show", __ref);}
 BA.debugLineNum = 15;BA.debugLine="Public Sub Show";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="mElement = BANano.GetElement(\"#mainHolder\").Appen";
Debug.ShouldStop(32768);
__ref.setField ("_melement" /*RemoteObject*/ ,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#mainHolder"))).runMethod(false,"Append",(Object)(((RemoteObject.createImmutable("<label><B>AI MUSIC GENERATION</B></label><br><br>"))))));
 BA.debugLineNum = 17;BA.debugLine="PlayM = BANano.GetElement(\"#mainHolder\").Append($";
Debug.ShouldStop(65536);
__ref.setField ("_playm" /*RemoteObject*/ ,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#mainHolder"))).runMethod(false,"Append",(Object)(((RemoteObject.createImmutable("<button id=\"music\" Type=\"button\" class=\"\">Generate</button><br><br>"))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("#music")))));
 BA.debugLineNum = 18;BA.debugLine="StopM = BANano.GetElement(\"#mainHolder\").Append($";
Debug.ShouldStop(131072);
__ref.setField ("_stopm" /*RemoteObject*/ ,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#mainHolder"))).runMethod(false,"Append",(Object)(((RemoteObject.createImmutable("<button id=\"stop\" Type=\"button\"> Stop </button><br><br>"))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("#stop")))));
 BA.debugLineNum = 19;BA.debugLine="BANano.GetElement(\"#mainHolder\").Append($\"<label";
Debug.ShouldStop(262144);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#mainHolder"))).runVoidMethod ("Append",(Object)(((RemoteObject.createImmutable("<label id=\"lab\"> - </label>")))));
 BA.debugLineNum = 21;BA.debugLine="PlayM.HandleEvents(\"click\", Me, \"music_click\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_playm" /*RemoteObject*/ ).runVoidMethod ("HandleEvents",(Object)(BA.ObjectToString("click")),(Object)(__ref),(Object)(RemoteObject.createImmutable("music_click")));
 BA.debugLineNum = 22;BA.debugLine="StopM.HandleEvents(\"click\", Me, \"stop_click\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_stopm" /*RemoteObject*/ ).runVoidMethod ("HandleEvents",(Object)(BA.ObjectToString("click")),(Object)(__ref),(Object)(RemoteObject.createImmutable("stop_click")));
 BA.debugLineNum = 23;BA.debugLine="StopM.SetStyle($\"{ \"visibility\": \"hidden\"} \"$)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_stopm" /*RemoteObject*/ ).runVoidMethod ("SetStyle",(Object)((RemoteObject.createImmutable("{ \"visibility\": \"hidden\"} "))));
 BA.debugLineNum = 24;BA.debugLine="TS.Initialize(BANano,Me,\"TS\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ts" /*RemoteObject*/ ).runClassMethod (b4j.example.sdtensorflowclass.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ )),(Object)(__ref),(Object)(RemoteObject.createImmutable("TS")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("stop_click (pagehome) ","pagehome",1,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("stop_click")) { return __ref.runUserSub(false, "pagehome","stop_click", __ref);}
 BA.debugLineNum = 33;BA.debugLine="Private Sub stop_click";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="TS.StopMusic";
Debug.ShouldStop(2);
__ref.getField(false,"_ts" /*RemoteObject*/ ).runClassMethod (b4j.example.sdtensorflowclass.class, "_stopmusic" /*RemoteObject*/ );
 BA.debugLineNum = 35;BA.debugLine="BANano.GetElement(\"#lab\").SetText($\"-\"$)";
Debug.ShouldStop(4);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#lab"))).runVoidMethod ("SetText",(Object)((RemoteObject.createImmutable("-"))));
 BA.debugLineNum = 36;BA.debugLine="StopM.SetStyle($\"{ \"visibility\": \"hidden\"} \"$)";
Debug.ShouldStop(8);
__ref.getField(false,"_stopm" /*RemoteObject*/ ).runVoidMethod ("SetStyle",(Object)((RemoteObject.createImmutable("{ \"visibility\": \"hidden\"} "))));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ts_startedmusic(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TS_StartedMusic (pagehome) ","pagehome",1,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("ts_startedmusic")) { return __ref.runUserSub(false, "pagehome","ts_startedmusic", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub TS_StartedMusic";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="StopM.SetStyle($\"{ \"visibility\": \"visible\"} \"$)";
Debug.ShouldStop(128);
__ref.getField(false,"_stopm" /*RemoteObject*/ ).runVoidMethod ("SetStyle",(Object)((RemoteObject.createImmutable("{ \"visibility\": \"visible\"} "))));
 BA.debugLineNum = 41;BA.debugLine="BANano.GetElement(\"#lab\").SetText($\"Started\"$)";
Debug.ShouldStop(256);
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#lab"))).runVoidMethod ("SetText",(Object)((RemoteObject.createImmutable("Started"))));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}