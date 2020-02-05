package com.cdainfo.tamagochi.estados;

import com.cdainfo.tamagochi.State;
import com.cdainfo.tamagochi.Tamagochi;

public class Jugar extends State {
 private Tamagochi tamagochi;
	public void Jugar(){
	System.out.println("Salio esas rankeds bb");
	 tamagochi.setState(new Tilt());
	
	}
	
}
