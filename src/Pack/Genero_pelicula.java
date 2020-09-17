package Pack;

public class Genero_pelicula {
	
	private String nombre;

	public Genero_pelicula(String nombre) {
		
		this.nombre = nombre;
	}
	
	public Genero_pelicula() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		
		return nombre;
		
	}
	
}
