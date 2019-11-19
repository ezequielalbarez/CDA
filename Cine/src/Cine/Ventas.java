package Cine;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ventas {
	private int sala1 = 20;
	private int sala2 = 20;
	private int sala3 = 20;
	private int[] precios = { 15, 20, 18 };
	private int recaudado = 0;
	int menores = 0;
	int edad;
	int cont = 0;
	int mayores = 0;
	int sumatoria = 0;
	String rst = "";

	public void salas() {
		Scanner scn = new Scanner(System.in);

		do {
			System.out.println("que sala quiere? cine/1 , cine2/2, cine3/3");
			int sala = scn.nextInt();

			System.out.println("cuantas entradas quire ?");
			int entrada = scn.nextInt();
			switch (sala) {
			case 1:
				sala1 = sala1 - entrada;

			case 2:
				sala2 = sala2 - entrada;

			case 3:
				sala3 = sala3 - entrada;
			}
			// metodo de pago
			System.out.println("");

			for (int i = 0; i < entrada; i++) {
				System.out.println("ingrese la edad de la entrada numero " + i);
				edad = scn.nextInt();
				if (edad > 18) {
					System.out.println("valor de entrada 20");
					recaudado = recaudado + 20;

				}
				if (edad < 18) {
					System.out.println("valor de entrada 15");
					recaudado = recaudado + 15;
				} else if (edad > 65) {
					System.out.println("valor de entrada 18");
					recaudado = recaudado + 18;
				}
			}
			System.out.println("cantidad de butacas" + entrada);
			System.out.println("total a pagar" + recaudado);
			System.out.println("quiere comprar mas entradas s/si n/no");
			rst = scn.next();
		} while (rst.equals("s"));
	}

//LUGARES :)
	public void butacas() {
          int disponible;
		 int capacidad = 20;
		int[][] butacas = new int[4][5];

		for (int i = 0; i <butacas.length; i++) {
			for(int j=0 ; j<butacas.length; j++) {
				butacas[i][j]=;
				return matriz ;
				
			}
			for (int i = 0;i<capacidad; i++) {
				for(int j=0 ; j<5; j++) {

		}
	}

}
