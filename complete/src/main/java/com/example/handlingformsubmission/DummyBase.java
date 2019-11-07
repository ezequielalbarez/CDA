package com.example.handlingformsubmission;

import java.util.HashMap;
import java.util.Map;

public class DummyBase {

	private static Map<String, String> mapa;

	static {
		mapa= new HashMap<String,String>();
		mapa.put("fede", "frutos");
		mapa.put("ezequiel", "albarez");
		mapa.put("redondito", "ricota");
	}

	public static Map<String, String> setMap(String usuario, String password) {
		mapa.put(usuario, password);
		return mapa;
	}

	public static Map<String, String> getMap() {
		return mapa;
	}

}
