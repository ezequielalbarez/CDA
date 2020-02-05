package com.cdainfo.tamagochi.estados;

import java.util.Timer;
import java.util.TimerTask;

import com.cdainfo.tamagochi.State;
import com.cdainfo.tamagochi.Tamagochi;

public class Durmiendo extends State {
	private Tamagochi tamagochi;

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
	}

	public void setTamagochi(Tamagochi tamagochi) {
		this.tamagochi = tamagochi;
	Timer timer = new Timer();
 timer.schedule(new TimerTask() {
	
	@Override
	public void run() {
		Durmiendo.this.tamagochi.setState(new Hambriento());
		
	}
},  5000);
}
}