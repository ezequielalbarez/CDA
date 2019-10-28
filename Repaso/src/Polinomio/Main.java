package Polinomio;

public class Main {

		 public static void main(String args[])
		   {
		      System.out.println("Polinomio 1");
		      Polinomio polinomio1 = new Polinomio();
		      polinomio1.leer();
		      polinomio1.imprimir();
		 
		      System.out.println("\n\nPolinomio 2");
		      Polinomio polinomio2 = new Polinomio();
		      polinomio2.leer();
		      polinomio2.imprimir();
		 
		      System.out.println();
		      imprimirOperacion( polinomio1, polinomio2, "+", polinomio1.sumar(polinomio2) );
		      imprimirOperacion( polinomio1, polinomio2, "-", polinomio1.restar(polinomio2) );
		      imprimirOperacion( polinomio2, polinomio1, "-", polinomio2.restar(polinomio1) );
		      imprimirOperacion( polinomio1, polinomio2, "*", polinomio1.multiplicar(polinomio2) );
		   }

		private static void imprimirOperacion(Polinomio polinomio1, Polinomio polinomio2, String string,
				Polinomio sumar) {
		
			
		}	

	}


