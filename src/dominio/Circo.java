package dominio;

import java.util.ArrayList;

public class Circo {
	private String nombre;
	private ArrayList<Artista> artistas=new ArrayList<Artista>();
	private int duracionFuncion;

	public Circo(String nombre, int duracionFuncion) {
		this.nombre = nombre;
		this.duracionFuncion = duracionFuncion;
	}
	public void agregarArtista(Artista artista){
		this.artistas.add(artista);
	}
	public  void darFuncion() throws InterruptedException {
		System.out.println("=== El circo "+this.nombre+ " anuncia la primera llamada.. primera ===");
		this.esperarQuePasenNsegundos(3);
		System.out.println("=== El circo "+this.nombre+ " anuncia la segunda llamada.. segunda ===");
		this.esperarQuePasenNsegundos(3);
		System.out.println("=== El circo "+this.nombre+ " anuncia la tercera llamada.. iniciamos!! ===");
		this.esperarQuePasenNsegundos(3);
		
		this.solicitarInicioDeActos();
		this.esperarQuePasenNsegundos(this.duracionFuncion);
		System.out.println("\n========== Suena la m�sica de despedida ============\n");
		this.solicitarFinalizacionDeActos();
		
		this.esperarFinalizacionDeActos();
		System.out.println("\n========== Fin de la funci�n del circo =============\n");
	}
	public void esperarQuePasenNsegundos(int segundos){
		try{
			Thread.sleep(segundos*1000);
		}
		catch(InterruptedException e){
			return;
		}
	}
	public void solicitarInicioDeActos(){
		for (Artista artistaI:this.artistas)
			artistaI.arrancarActo();
	}
	public void solicitarFinalizacionDeActos(){
		for (Artista artistaI:this.artistas)
			artistaI.solicitarFinDeActoEnEjecucion();
	}
	public void esperarFinalizacionDeActos(){
		for (Artista artistaI:this.artistas)
			artistaI.esperarFinDeActoEnEjecucion();;
		
	}
	public void mostrarEstadisticas(){
		System.out.println("\n--------------------------------------------- Estad�sticas ---------------------------------------------");
		for(Artista artistaI:this.artistas){
			System.out.println("El(la) "+artistaI.especialidad + "(a) " + 
					"\"" + artistaI.getNombre() + "\"" +
					" present� "+artistaI.getNumActosRealizados()+ " actos"
							+" de "+artistaI.getNumActosProgramados()+ " programados, con pausas de "
					+ artistaI.getPausaEntreActos()+" segundos");
		}
		System.out.println("\nEn una funci�n que dur� "+this.duracionFuncion+" segundos");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
	}
	public void cargarConfiguracion(){
		Artista domador = Artista.crearArtista(Artista.DOMADOR, "Don Juli�n");
		domador.setPistaAsignada(1);
		domador.setPausaEntreActos(10);
		domador.setNumActosProgramados(14);
		this.agregarArtista(domador);
		Artista payaso1 = Artista.crearArtista(Artista.PAYASO, "Frijol�n");
		payaso1.setPistaAsignada(2);
		payaso1.setPausaEntreActos(4);
		payaso1.setNumActosProgramados(9);
		this.agregarArtista(payaso1);
		Artista payaso2 = Artista.crearArtista(Artista.PAYASO, "Jodini");
		payaso2.setPausaEntreActos(6);
		payaso2.setPistaAsignada(3);
		this.agregarArtista(payaso2);
	}
}
