
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class sdtensorflowclass {
    public static RemoteObject myClass;
	public sdtensorflowclass() {
	}
    public static PCBA staticBA = new PCBA(null, sdtensorflowclass.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _x = null;
public static RemoteObject _y = null;
public static RemoteObject _modelname = null;
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _model = RemoteObject.declareNull("Object");
public static RemoteObject _player = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"model",_ref.getField(false, "_model"),"modelName",_ref.getField(false, "_modelname"),"Player",_ref.getField(false, "_player"),"X",_ref.getField(false, "_x"),"Y",_ref.getField(false, "_y")};
}
}