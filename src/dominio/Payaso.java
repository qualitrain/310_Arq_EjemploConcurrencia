package dominio;

public class Payaso extends Artista {

	public Payaso(String nombre, String especialidad) {
		super(nombre, especialidad);
	}

	@Override
	public void presentarse() {
		System.out.println("("+this.pistaAsignada+")"+"\tEl payaso "
				+ this.nombre+" entra a la pista "+this.pistaAsignada+
				" lanzando besos al publico"+
				" y dice: \n\tAmiguitoooooss quieren que les cuente un"
				+ " cuento???"+"\n\tMe confunden!!! yo no cuento cuentoooosss");
	}

	@Override
	public void despedirse() {
		System.out.println("("+this.pistaAsignada+")"+"\tEl payaso "
				+ this.nombre+" sale de la pista "+this.pistaAsignada+
				" levantando los brazos como boxeador"+
				" y grita: \n\tAmiguitoooooss si tienen espejo ahí se ven!!"
				+ " si tienen tele ahí me veeeeennn!!!");
	}

	@Override
	public void ejecutarActoComplementario() {
		System.out.println("("+this.pistaAsignada+")"+"\tEl payaso "+this.nombre+" cuenta un chiste de políticos"
				+ " en la pista "+this.pistaAsignada);
	}

	@Override
	public void ejecutarActoSecundario() {
		System.out.println("("+this.pistaAsignada+")"+"\tEl payaso "+this.nombre+ " imita a un chango y lanza"
				+ " globos de harina a un patiño en la pista "+this.pistaAsignada);
	}

	@Override
	public void ejecutarActoPrincipal() {
		System.out.println("("+this.pistaAsignada+")"+"\tEl payaso "+this.nombre+ " patina graciosamente "
				+ "y baila una coreografía de ballet en la pista "+this.pistaAsignada);
	}

}
