package com.cdainfo.tamagochi.estados;

import com.cdainfo.tamagochi.State;
import com.cdainfo.tamagochi.Tamagochi;

public class Hambriento extends State {
	
	private Tamagochi tamagochi;

	

	@Override
	public void alimentar() {
	System.out.println("salio 180 bbs");
	 tamagochi.setState(new Jugar());
	
	}
	

}

