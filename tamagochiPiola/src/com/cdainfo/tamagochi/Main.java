package com.cdainfo.tamagochi;

import com.cdainfo.tamagochi.estados.Menu;

public class Main {

	public static void main(String[] args) {
		Tamagochi miTamagochi = new Tamagochi();
		new Menu(miTamagochi).display();
	}

}
