package servicios;

import dominio.Circo;

public class ProbadorCircoConcurrente {

	public static void main(String[] args) throws Exception {
		
		Circo elCircoJava = new Circo("El circo de Java",60);
		elCircoJava.cargarConfiguracion();
		elCircoJava.darFuncion();
		elCircoJava.mostrarEstadisticas();
	}

}
