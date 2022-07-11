package dominio;

public abstract class Artista implements Runnable {
	public static final int PAYASO = 1;
	public static final int DOMADOR = 2;
	
	protected String nombre;
	protected String especialidad;
	protected int pistaAsignada;
	protected int pausaEntreActos;
	private int numActosRealizados = 0;
	private int numActosProgramados = 10;
	
	private Thread hiloActor = null;
		
	
	public static Artista crearArtista(int tipoArtista, String nombre){
		switch(tipoArtista){
			case Artista.PAYASO:
				return new Payaso(nombre,"payasito");
			case Artista.DOMADOR:
				return new Domador(nombre,"domador");
		}
		return null;
	}
	protected Artista(String nombre, String especialidad) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.numActosProgramados = 10;
		this.hiloActor = new Thread(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getPistaAsignada() {
		return pistaAsignada;
	}

	public void setPistaAsignada(int pistaAsignada) {
		this.pistaAsignada = pistaAsignada;
	}

	public int getPausaEntreActos() {
		return pausaEntreActos;
	}

	public void setPausaEntreActos(int pausaEntreActos) {
		this.pausaEntreActos = pausaEntreActos;
	}
	
	public int getNumActosRealizados() {
		return numActosRealizados;
	}
	
	public int getNumActosProgramados() {
		return numActosProgramados;
	}
	public void setNumActosProgramados(int numActosProgramados) {
		this.numActosProgramados = numActosProgramados;
	}
	public abstract void presentarse();
	public abstract void despedirse();
	
	public void arrancarActo(){
		this.hiloActor.start();
	}
	public void solicitarFinDeActoEnEjecucion(){
		this.hiloActor.interrupt();
	}
	public void esperarFinDeActoEnEjecucion(){
		try{
			this.hiloActor.join();
		}
		catch(InterruptedException e){

			return;
		}
	}
	public void ejecutarActo(){
		this.numActosRealizados++;
		int numeroAleatorio = (int) (Math.random()*6);
		int actoAejecutar = (numeroAleatorio % 3) + 1;
		switch(actoAejecutar){
		case 1:
			this.ejecutarActoPrincipal();
			break;
		case 2:
			this.ejecutarActoSecundario();
			break;
		case 3:
			this.ejecutarActoComplementario();
			break;
		}
	}
	public abstract void ejecutarActoComplementario();
	public abstract void ejecutarActoSecundario();
	abstract public void ejecutarActoPrincipal();

	@Override
	public void run() {
		try{
			this.presentarse();
			for(int i=0;i<this.numActosProgramados;i++){
				Thread.sleep(this.pausaEntreActos*1000);
				this.ejecutarActo();
			}
		}
		catch(InterruptedException e){
			System.out.println("==> Se interrumpe a "+this.nombre+" famoso "+this.especialidad+
					" actuando en la pista "+this.pistaAsignada);
		}
		finally{
			this.despedirse();
		}
		
	}

}
