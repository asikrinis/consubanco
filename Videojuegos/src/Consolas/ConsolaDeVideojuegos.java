package Consolas;

public abstract class ConsolaDeVideojuegos {
	
	private String nombre;
	
	private String paisOrigen;
	
	private int year;
	
	private String noSerie;
	

	public ConsolaDeVideojuegos(String nombre, String paisOrigen, int year, String noSerie) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.year = year;
		this.noSerie = noSerie;
	}

	public ConsolaDeVideojuegos(String nombre, String paisOrigen, String noSerie) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.noSerie = noSerie;
	}

	
	@Override
	public String toString() {
		return "ConsolaDeVideojuegos [nombre=" + nombre + ", paisOrigen=" + paisOrigen + ", year=" + year + ", noSerie="
				+ noSerie + "]";
	}
	
}
