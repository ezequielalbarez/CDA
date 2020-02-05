package com.cdainfo.tamagochi.estados;

import com.cdainfo.tamagochi.State;
import com.cdainfo.tamagochi.Tamagochi;

public class Tilt extends State{
	private Tamagochi tamagochi;
	public void tirarTodo() {
   System.out.println("ME VIVEN CAGANDO");
	tamagochi.setState(new Cansado());
	}
}


