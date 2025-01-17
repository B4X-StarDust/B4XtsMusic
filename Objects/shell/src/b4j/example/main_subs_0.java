package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,91);
if (RapidSub.canDelegate("application_error")) { return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 91;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,21);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 21;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 25;BA.debugLine="Log(\"BANanoLOGS\")";
Debug.ShouldStop(16777216);
main.__c.runVoidMethod ("LogImpl","765540",RemoteObject.createImmutable("BANanoLOGS"),0);
 BA.debugLineNum = 29;BA.debugLine="BANano.Initialize(\"BANano\", AppName,DateTime.Now)";
Debug.ShouldStop(268435456);
main._banano.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("BANano")),(Object)(main._appname),(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 30;BA.debugLine="BANano.Header.Title=AppTitle";
Debug.ShouldStop(536870912);
main._banano.getField(false,"Header").setField ("Title",main._apptitle);
 BA.debugLineNum = 32;BA.debugLine="BANano.JAVASCRIPT_NAME = \"app\" & DateTime.Now & \"";
Debug.ShouldStop(-2147483648);
main._banano.setField ("JAVASCRIPT_NAME",RemoteObject.concat(RemoteObject.createImmutable("app"),main.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(".js")));
 BA.debugLineNum = 34;BA.debugLine="BANano.Header.Author =\"Star-Dust\"";
Debug.ShouldStop(2);
main._banano.getField(false,"Header").setField ("Author",BA.ObjectToString("Star-Dust"));
 BA.debugLineNum = 36;BA.debugLine="BANano.Header.Description = \"Car Up Keep\"";
Debug.ShouldStop(8);
main._banano.getField(false,"Header").setField ("Description",BA.ObjectToString("Car Up Keep"));
 BA.debugLineNum = 38;BA.debugLine="BANano.Header.Keywords = \"Software,mobile,desktop";
Debug.ShouldStop(32);
main._banano.getField(false,"Header").setField ("Keywords",BA.ObjectToString("Software,mobile,desktop,ios,android"));
 BA.debugLineNum = 39;BA.debugLine="BANano.Header.Language = \"it\"";
Debug.ShouldStop(64);
main._banano.getField(false,"Header").setField ("Language",BA.ObjectToString("it"));
 BA.debugLineNum = 40;BA.debugLine="BANano.Header.AddMeta($\"<meta name=\"copyright\" co";
Debug.ShouldStop(128);
main._banano.getField(false,"Header").runVoidMethod ("AddMeta",(Object)((RemoteObject.createImmutable("<meta name=\"copyright\" content=\"&copy; 2020 BVAD3\">"))));
 BA.debugLineNum = 41;BA.debugLine="BANano.Header.AddMeta($\"<meta name=\"robots\" conte";
Debug.ShouldStop(256);
main._banano.getField(false,"Header").runVoidMethod ("AddMeta",(Object)((RemoteObject.createImmutable("<meta name=\"robots\" content=\"ALL\">"))));
 BA.debugLineNum = 44;BA.debugLine="BANano.Header.AddJavascriptFile(\"https://cdn.jsde";
Debug.ShouldStop(2048);
main._banano.getField(false,"Header").runVoidMethod ("AddJavascriptFile",(Object)(RemoteObject.createImmutable("https://cdn.jsdelivr.net/npm/@tensorflow/tfjs@latest/dist/tf.min.js")));
 BA.debugLineNum = 46;BA.debugLine="BANano.Header.AddJavascriptFile(\"https://cdn.jsde";
Debug.ShouldStop(8192);
main._banano.getField(false,"Header").runVoidMethod ("AddJavascriptFile",(Object)(RemoteObject.createImmutable("https://cdn.jsdelivr.net/npm/@magenta/music@1.0.0")));
 BA.debugLineNum = 50;BA.debugLine="BANano.TranspilerOptions.MergeAllCSSFiles = True";
Debug.ShouldStop(131072);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setMergeAllCSSFiles",main.__c.getField(true,"True"));
 BA.debugLineNum = 51;BA.debugLine="BANano.TranspilerOptions.MergeAllJavascriptFiles";
Debug.ShouldStop(262144);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setMergeAllJavascriptFiles",main.__c.getField(true,"True"));
 BA.debugLineNum = 52;BA.debugLine="BANano.TranspilerOptions.RemoveDeadCode = True";
Debug.ShouldStop(524288);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setRemoveDeadCode",main.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="BANano.TranspilerOptions.ShowWarningDeadCode = Tr";
Debug.ShouldStop(1048576);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setShowWarningDeadCode",main.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="BANano.TranspilerOptions.EnableLiveCodeSwapping =";
Debug.ShouldStop(2097152);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setEnableLiveCodeSwapping",main.__c.getField(true,"True"));
 BA.debugLineNum = 63;BA.debugLine="BANano.Header.BackgroundColor = \"#1e1e1e\"";
Debug.ShouldStop(1073741824);
main._banano.getField(false,"Header").setField ("BackgroundColor",BA.ObjectToString("#1e1e1e"));
 BA.debugLineNum = 69;BA.debugLine="BANano.Header.MSTileColor = \"#ffc40d\"";
Debug.ShouldStop(16);
main._banano.getField(false,"Header").setField ("MSTileColor",BA.ObjectToString("#ffc40d"));
 BA.debugLineNum = 73;BA.debugLine="BANano.PHP_NAME = $\"${AppName}.php\"$";
Debug.ShouldStop(256);
main._banano.setField ("PHP_NAME",(RemoteObject.concat(RemoteObject.createImmutable(""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._appname))),RemoteObject.createImmutable(".php"))));
 BA.debugLineNum = 74;BA.debugLine="BANano.PHPHost = $\"${ServerIP}/\"$";
Debug.ShouldStop(512);
main._banano.setField ("PHPHost",(RemoteObject.concat(RemoteObject.createImmutable(""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._serverip))),RemoteObject.createImmutable("/"))));
 BA.debugLineNum = 75;BA.debugLine="BANano.PHPAddHeader(\"Access-Control-Allow-Origin:";
Debug.ShouldStop(1024);
main._banano.runVoidMethod ("PHPAddHeader",(Object)(RemoteObject.createImmutable("Access-Control-Allow-Origin: *")));
 BA.debugLineNum = 78;BA.debugLine="BANano.Build(Publish)";
Debug.ShouldStop(8192);
main._banano.runVoidMethod ("Build",(Object)(main._publish));
 BA.debugLineNum = 84;BA.debugLine="fx.ShowExternalDocument($\"${ServerIP}/${AppName}";
Debug.ShouldStop(524288);
main._fx.runVoidMethod ("ShowExternalDocument",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._serverip))),RemoteObject.createImmutable("/"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._appname))),RemoteObject.createImmutable("/index.html")))));
 BA.debugLineNum = 86;BA.debugLine="Log(\"Completed \" & DateTime.Time(DateTime.now))";
Debug.ShouldStop(2097152);
main.__c.runVoidMethod ("LogImpl","765601",RemoteObject.concat(RemoteObject.createImmutable("Completed "),main.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")))),0);
 BA.debugLineNum = 87;BA.debugLine="ExitApplication";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _banano_ready() throws Exception{
try {
		Debug.PushSubsStack("BANano_Ready (main) ","main",0,main.ba,main.mostCurrent,96);
if (RapidSub.canDelegate("banano_ready")) { return b4j.example.main.remoteMe.runUserSub(false, "main","banano_ready");}
RemoteObject _body = RemoteObject.declareNull("com.ab.banano.BANanoElement");
 BA.debugLineNum = 96;BA.debugLine="Sub BANano_Ready()";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="Private body As BANanoElement";
Debug.ShouldStop(2);
_body = RemoteObject.createNew ("com.ab.banano.BANanoElement");Debug.locals.put("body", _body);
 BA.debugLineNum = 99;BA.debugLine="body.Initialize(\"#body\")";
Debug.ShouldStop(4);
_body.runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("#body"))));
 BA.debugLineNum = 101;BA.debugLine="body.SetStyle($\"{ \"width\": \"100%\",\"justify-conten";
Debug.ShouldStop(16);
_body.runVoidMethod ("SetStyle",(Object)((RemoteObject.createImmutable("{ \"width\": \"100%\",\"justify-content\": \"space-between\", \"text-align\": \"center\"} "))));
 BA.debugLineNum = 102;BA.debugLine="body.Append($\"<div id=\"mainHolder\"></div>\"$).Get(";
Debug.ShouldStop(32);
_body.runMethod(false,"Append",(Object)(((RemoteObject.createImmutable("<div id=\"mainHolder\"></div>"))))).runVoidMethod ("Get",(Object)((RemoteObject.createImmutable("#mainHolder"))));
 BA.debugLineNum = 104;BA.debugLine="HomePage.Initialize(BANano)";
Debug.ShouldStop(128);
main._homepage.runClassMethod (b4j.example.pagehome.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._banano));
 BA.debugLineNum = 106;BA.debugLine="HomePage.Show";
Debug.ShouldStop(512);
main._homepage.runClassMethod (b4j.example.pagehome.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
pagehome.myClass = BA.getDeviceClass ("b4j.example.pagehome");
sdtensorflowclass.myClass = BA.getDeviceClass ("b4j.example.sdtensorflowclass");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 11;BA.debugLine="Public AppName As String = \"MusicModel\"";
main._appname = BA.ObjectToString("MusicModel");
 //BA.debugLineNum = 12;BA.debugLine="Public AppTitle As String = \"MusicModel\"";
main._apptitle = BA.ObjectToString("MusicModel");
 //BA.debugLineNum = 13;BA.debugLine="Private Publish As String = \"C:\\laragon\\www\"";
main._publish = BA.ObjectToString("C:\\laragon\\www");
 //BA.debugLineNum = 14;BA.debugLine="Public Version As String = \"1.00\"";
main._version = BA.ObjectToString("1.00");
 //BA.debugLineNum = 15;BA.debugLine="Public ServerIP As String = \"http://localhost/\"";
main._serverip = BA.ObjectToString("http://localhost/");
 //BA.debugLineNum = 17;BA.debugLine="Private BANano As BANano 'ignore";
main._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 18;BA.debugLine="Private HomePage As pageHome";
main._homepage = RemoteObject.createNew ("b4j.example.pagehome");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}