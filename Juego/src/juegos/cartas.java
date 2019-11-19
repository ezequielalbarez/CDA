package juegos;

import java.util.ArrayList;

public class cartas {
	private String[] palo = { "Basto", "Espada", "Oro", "Copa" };
	private String[] numero = { "1", "2", " 3", "4", "5", " 6", " 7", "10", " 11", "12" };
	private String[][] mazo = new String[3][10];

	public String[][] Maso() {
		for(int i = 0;i<numero.length;i++) {
			for(int j=0;j<palo.length;j++) {
				mazo[i][j]= palo[i] + numero[j];
		
			}
		}
			return mazo;
		}

	public void mostrar() {
	String[][] test = Maso();	
	
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.println(mazo[i][j]);

			}
		}
	}
    public String[][] Mezclar() {
    	int range = 40 -1;
    }
    
}
