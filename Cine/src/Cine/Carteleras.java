package Cine;

public class Carteleras {
	private static SalaDeCine[] funciones = new SalaDeCine[3];

	public static SalaDeCine[] getFunciones() {
		return funciones;
	}

	public static void setFunciones(SalaDeCine[] funciones) {
		cine.funciones = funciones;

	}

	public static void cargarFunciones() {
		pelicula peli1 = new pelicula("la wea", 18);
		peliciula peli2 = new pelicula("esperando a la carroza", 0);
		peliciula peli3 = new pelicula("esperando a la carroza", 0);

		SalaDeCine sala1 = new SalaDeCine(peli1);
		SalaDeCine sala2 = new SalaDeCine(peli2);
		SalaDeCine sala3 = new SalaDeCine(peli3);

		funciones[0] = sala1;
		funciones[1] = sala2;
		funciones[2] = sala3;
	}

	public static void main(String[] args) {

		CineSistema.sistemaPrincipal(funciones);
	}
}
