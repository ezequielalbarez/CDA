package Triangulo;
// hacer variables atributos
// construcyot
//metodo para perimetro y area


public class Isosceles {
	private int lado1 = 0;
	private int lado2 = 0;
	private int lado3 = 0;
	private int base;
	private int altura;
	private int perimetro;
	private int area;
	
	
	public Isosceles(int base, int altura) {
		this.altura = altura;
		this.base = base;
	}
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	public int getLado3() {
		return lado3;
	}
	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getArea() {
		return this.area;
	}
	public int getperimetro() {
		return this.perimetro;
	}
	
public void perimetro() {
	int c1 = this.altura;  
	int c2 = this.base;
	 int h =(int) Math.sqrt((int) Math.pow(c1, 2) + (int) Math.pow(c2, 2));
	this.perimetro = this.base+(2* h);

}
   public void Area() {
	  
	  this.area =( this.base * this.altura ) / 2;
	 }
   
}