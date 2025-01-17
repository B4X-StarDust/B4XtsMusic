
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pagehome {
    public static RemoteObject myClass;
	public pagehome() {
	}
    public static PCBA staticBA = new PCBA(null, pagehome.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _melement = RemoteObject.declareNull("com.ab.banano.BANanoElement");
public static RemoteObject _playm = RemoteObject.declareNull("com.ab.banano.BANanoElement");
public static RemoteObject _stopm = RemoteObject.declareNull("com.ab.banano.BANanoElement");
public static RemoteObject _ts = RemoteObject.declareNull("b4j.example.sdtensorflowclass");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"mElement",_ref.getField(false, "_melement"),"PlayM",_ref.getField(false, "_playm"),"StopM",_ref.getField(false, "_stopm"),"TS",_ref.getField(false, "_ts")};
}
}