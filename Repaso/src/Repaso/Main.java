package Repaso;

public class Main {

	public static void main(String[] args) {
		int[] vectorP = {2,4,6,8,10};
		int[] vectorI = {1,3,5,7,9};
		int[] vector = new int[10];
		int aux=0;
		int aux1=0;
			for(int i=0;i<vectorP.length;i++) {
				
				if(i%2 == 0) {
					vector[i] = vectorP[i];
					vectorP[i] = aux;
					System.out.println("sus numeros son..;"+ aux);
					
				}
				else {
					vector[i] = vectorI[i];
					vectorI[i] = aux1;
					System.out.println("sus numeros son..;"+ aux1);
					
			}
						
						
					}
				}		
       }
	