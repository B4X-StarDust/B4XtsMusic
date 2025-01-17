package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static String _appname = "";
public static String _apptitle = "";
public static String _publish = "";
public static String _version = "";
public static String _serverip = "";
public static com.ab.banano.BANano _banano = null;
public static b4j.example.pagehome _homepage = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="Log(\"BANanoLOGS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("765540","BANanoLOGS",0);
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="BANano.Initialize(\"BANano\", AppName,DateTime.Now)";
_banano.Initialize("BANano",_appname,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="BANano.Header.Title=AppTitle";
_banano.Header.Title = _apptitle;
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="BANano.JAVASCRIPT_NAME = \"app\" & DateTime.Now & \"";
_banano.JAVASCRIPT_NAME = "app"+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+".js";
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="BANano.Header.Author =\"Star-Dust\"";
_banano.Header.Author = "Star-Dust";
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="BANano.Header.Description = \"Car Up Keep\"";
_banano.Header.Description = "Car Up Keep";
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="BANano.Header.Keywords = \"Software,mobile,desktop";
_banano.Header.Keywords = "Software,mobile,desktop,ios,android";
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="BANano.Header.Language = \"it\"";
_banano.Header.Language = "it";
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="BANano.Header.AddMeta($\"<meta name=\"copyright\" co";
_banano.Header.AddMeta(("<meta name=\"copyright\" content=\"&copy; 2020 BVAD3\">"));
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="BANano.Header.AddMeta($\"<meta name=\"robots\" conte";
_banano.Header.AddMeta(("<meta name=\"robots\" content=\"ALL\">"));
RDebugUtils.currentLine=65559;
 //BA.debugLineNum = 65559;BA.debugLine="BANano.Header.AddJavascriptFile(\"https://cdn.jsde";
_banano.Header.AddJavascriptFile("https://cdn.jsdelivr.net/npm/@tensorflow/tfjs@latest/dist/tf.min.js");
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="BANano.Header.AddJavascriptFile(\"https://cdn.jsde";
_banano.Header.AddJavascriptFile("https://cdn.jsdelivr.net/npm/@magenta/music@1.0.0");
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="BANano.TranspilerOptions.MergeAllCSSFiles = True";
_banano.TranspilerOptions.setMergeAllCSSFiles(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="BANano.TranspilerOptions.MergeAllJavascriptFiles";
_banano.TranspilerOptions.setMergeAllJavascriptFiles(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65567;
 //BA.debugLineNum = 65567;BA.debugLine="BANano.TranspilerOptions.RemoveDeadCode = True";
_banano.TranspilerOptions.setRemoveDeadCode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65568;
 //BA.debugLineNum = 65568;BA.debugLine="BANano.TranspilerOptions.ShowWarningDeadCode = Tr";
_banano.TranspilerOptions.setShowWarningDeadCode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65569;
 //BA.debugLineNum = 65569;BA.debugLine="BANano.TranspilerOptions.EnableLiveCodeSwapping =";
_banano.TranspilerOptions.setEnableLiveCodeSwapping(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65578;
 //BA.debugLineNum = 65578;BA.debugLine="BANano.Header.BackgroundColor = \"#1e1e1e\"";
_banano.Header.BackgroundColor = "#1e1e1e";
RDebugUtils.currentLine=65584;
 //BA.debugLineNum = 65584;BA.debugLine="BANano.Header.MSTileColor = \"#ffc40d\"";
_banano.Header.MSTileColor = "#ffc40d";
RDebugUtils.currentLine=65588;
 //BA.debugLineNum = 65588;BA.debugLine="BANano.PHP_NAME = $\"${AppName}.php\"$";
_banano.PHP_NAME = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+".php");
RDebugUtils.currentLine=65589;
 //BA.debugLineNum = 65589;BA.debugLine="BANano.PHPHost = $\"${ServerIP}/\"$";
_banano.PHPHost = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_serverip))+"/");
RDebugUtils.currentLine=65590;
 //BA.debugLineNum = 65590;BA.debugLine="BANano.PHPAddHeader(\"Access-Control-Allow-Origin:";
_banano.PHPAddHeader("Access-Control-Allow-Origin: *");
RDebugUtils.currentLine=65593;
 //BA.debugLineNum = 65593;BA.debugLine="BANano.Build(Publish)";
_banano.Build(_publish);
RDebugUtils.currentLine=65599;
 //BA.debugLineNum = 65599;BA.debugLine="fx.ShowExternalDocument($\"${ServerIP}/${AppName}";
_fx.ShowExternalDocument((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_serverip))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+"/index.html"));
RDebugUtils.currentLine=65601;
 //BA.debugLineNum = 65601;BA.debugLine="Log(\"Completed \" & DateTime.Time(DateTime.now))";
anywheresoftware.b4a.keywords.Common.LogImpl("765601","Completed "+anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow()),0);
RDebugUtils.currentLine=65602;
 //BA.debugLineNum = 65602;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=65603;
 //BA.debugLineNum = 65603;BA.debugLine="End Sub";
return "";
}
public static String  _banano_ready() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "banano_ready", false))
	 {return ((String) Debug.delegate(ba, "banano_ready", null));}
com.ab.banano.BANanoElement _body = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub BANano_Ready()";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Private body As BANanoElement";
_body = new com.ab.banano.BANanoElement();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="body.Initialize(\"#body\")";
_body.Initialize((Object)("#body"));
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="body.SetStyle($\"{ \"width\": \"100%\",\"justify-conten";
_body.SetStyle(("{ \"width\": \"100%\",\"justify-content\": \"space-between\", \"text-align\": \"center\"} "));
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="body.Append($\"<div id=\"mainHolder\"></div>\"$).Get(";
_body.Append((Object)(("<div id=\"mainHolder\"></div>"))).Get((Object)("#mainHolder"));
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="HomePage.Initialize(BANano)";
_homepage._initialize /*String*/ (null,ba,_banano);
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="HomePage.Show";
_homepage._show /*String*/ (null);
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="End Sub";
return "";
}
}