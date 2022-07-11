package dominio;

public class Domador extends Artista {

	public Domador(String nombre, String especialidad) {
		super(nombre, especialidad);
	}

	@Override
	public void presentarse() {
		System.out.println("("+this.pistaAsignada+")"+" El famoso domador "
				+this.nombre +" entra a la jaula y presenta a sus tigres uno"
						+ " a uno en la pista "+this.pistaAsignada);
	}

	@Override
	public void despedirse() {
		System.out.println("("+this.pistaAsignada+")"+" El domador "
				+this.nombre +" sale de la jaula agradeciendo al público y"
						+ " pidiendo aplausos para sus tigres"
						+ " en la pista "+this.pistaAsignada);
	}

	@Override
	public void ejecutarActoComplementario() {
		System.out.println("("+this.pistaAsignada+")"+" El domador "+this.nombre+ " hace que un tigre"
				+ " pase sobre un aro de fuego en la pista "+this.pistaAsignada);

	}

	@Override
	public void ejecutarActoSecundario() {
		System.out.println("("+this.pistaAsignada+")"+" El domador "+this.nombre+ " hace que un oso"
				+ " pasee sobre un monociclo en la pista "+this.pistaAsignada);

	}

	@Override
	public void ejecutarActoPrincipal() {
		System.out.println("("+this.pistaAsignada+")"+" El domador "+this.nombre+ " hace bailar cha cha chá"
				+ " a todos los tigres en la pista "+this.pistaAsignada);
		
	}

}
