package com.example.handlingformsubmission;

public class VerificacionUsers {
	public boolean verificar(String usuario, String Password) {
	return (DummyBase.getMap().containsKey(usuario) && DummyBase.getMap().containsValue(Password));
	
	
}


}

