package com.cdainfo.tamagochi;

public class State {
private Tamagochi tamagochi;
	public void setState(Tamagochi tamagochi) {
		//this.tamagochi = tamagochi;
		this.tamagochi.setState(this);
	}

	public void jugar() {
		System.out.println("sale jugar lolcito");
	}

	public void alimentar() {
		System.out.println("dame de comer bro");
	}

	public void queOnda() {
		System.out.println("que onda bro");
	}

	public void dormir() {
		System.out.println("na amigo me das de comer?");
	}

	public void tilt() {
		System.out.println("AMIGO QUE MANCO QUE ES ESTE CHABON");
	}

	public void tirarTodo() {
		System.out.println("ME VIVEN CAGANDO");
	}



}
