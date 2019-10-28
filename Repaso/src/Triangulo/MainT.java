package Triangulo;

public class MainT {

	public static void main(String[] args) {
     Isosceles iso = new Isosceles(8,12);
     iso.perimetro(); 
     iso.Area();
     System.out.println(iso.getArea() + " " + iso.getperimetro());
	}

}
