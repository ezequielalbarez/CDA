package com.cdainfo.tamagochi.estados;

import com.cdainfo.tamagochi.State;
import com.cdainfo.tamagochi.Tamagochi;

public class Cansado extends State {
	private Tamagochi tamagochi;


	@Override
	public void dormir() {
	System.out.println("salio siestita ");
	 tamagochi.setState(new Durmiendo());
	}

}
