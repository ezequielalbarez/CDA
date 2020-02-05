package com.cdainfo.tamagochi.estados;

import com.cdainfo.tamagochi.State;
import com.cdainfo.tamagochi.Tamagochi;

public class Aburrido extends State{
private Tamagochi tamagochi;

	
	@Override
	public void jugar() {
		System.out.println("sale lolcito?");
		tamagochi.setState(new Tilt());
		

	}

	
}