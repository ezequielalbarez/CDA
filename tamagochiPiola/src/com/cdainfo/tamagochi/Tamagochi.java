package com.cdainfo.tamagochi;

import com.cdainfo.tamagochi.estados.Aburrido;

public class Tamagochi {
	private State estado;

	public Tamagochi() {
		setState(new Aburrido());

	}
	public void setState(State estado) {
		this.estado = estado;		
	}
	public void alimentar() {
		this.estado.alimentar();
	}
	public void dormir() {
		this.estado.dormir();
	}
	public void jugar() {
		this.estado.jugar();
	}
	public void queOnda() {
		this.estado.queOnda();
	}
	public void tirarTodo() {
		this.estado.queOnda();
	}
}