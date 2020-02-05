package com.cdainfo.tamagochi.estados;

import java.util.Scanner;

import com.cdainfo.tamagochi.Tamagochi;

public class Menu {
	    Tamagochi tamagochi;

	    public Menu(Tamagochi tamagochi) {
	        this.tamagochi = tamagochi;
	    }

	    public void display() {
	        Scanner scanner = new Scanner(System.in);
	        char opcion;
	        String mensajeOpciones = "Realizar acci�n: " +
	                "a) alimentar, d) dormir, j) jugar, p) preguntar, s) salir";

	        while (true) {
	            System.out.println(mensajeOpciones);
	            opcion = scanner.next().charAt(0);
	            switch (opcion) {
	                case 'a': tamagochi.alimentar(); break;
	                case 'd': tamagochi.dormir(); break;
	                case 'j': tamagochi.jugar(); break;
	                case 'p': tamagochi.queOnda(); break;
	                case 's': System.out.println("Hasta pronto!"); System.exit(0);
	                default: System.out.println("Opcion no v�lida");
	            }
	        }
	    }
	}

