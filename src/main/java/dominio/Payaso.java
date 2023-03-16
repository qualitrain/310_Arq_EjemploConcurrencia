package dominio;

public class Payaso extends Artista {

	public Payaso(String nombre, String especialidad) {
		super(nombre, especialidad);
	}
	
	public String getEspacios() {
		String espacios = "";
		for(int i=0; i<this.pistaAsignada; i++) {
			espacios += "   ";
		}
		return espacios;
	}

	@Override
	public void presentarse() {
		System.out.println("(" + this.pistaAsignada + ")" + this.getEspacios()
				+ "El payaso <<"
				+ this.nombre + ">> entra a la pista " + this.pistaAsignada
				+ " lanzando besos al publico"
				+ " y dice: \n"
				+ this.getEspacios() + "   Amiguitoooooss quieren que les cuente un"
				+ " cuento???"+"\n"
				+ this.getEspacios() + "   Me confunden!!! yo no cuento cuentoooosss");
	}

	@Override
	public void despedirse() {
		System.out.println("(" + this.pistaAsignada +")" + this.getEspacios() + "El payaso <<"
				+ this.nombre + ">> sale de la pista " + this.pistaAsignada
				+ " levantando los brazos como boxeador"
				+ " y grita: \n"
				+ this.getEspacios() + "   Amiguitoooooss si tienen espejo ahi se ven!!"
				+ " si tienen tele ahi me veeeeennn!!!");
	}

	@Override
	public void ejecutarActoComplementario() {
		System.out.println("("+this.pistaAsignada+")" + this.getEspacios() 
		        + "El payaso <<" + this.nombre
				+ ">> cuenta un chiste de politicos"
				+ " en la pista "+this.pistaAsignada);
	}

	@Override
	public void ejecutarActoSecundario() {
		System.out.println("("+this.pistaAsignada+")" + this.getEspacios()
				+"El payaso <<"+this.nombre
				+ ">> imita a un chango y lanza"
				+ " globos de harina a un patiño en la pista "+this.pistaAsignada);
	}

	@Override
	public void ejecutarActoPrincipal() {
		System.out.println("("+this.pistaAsignada+")" + this.getEspacios()
	            + "El payaso <<" + this.nombre + ">> patina graciosamente "
				+ "y baila una coreografia de ballet en la pista "
	            + this.pistaAsignada);
	}

}
