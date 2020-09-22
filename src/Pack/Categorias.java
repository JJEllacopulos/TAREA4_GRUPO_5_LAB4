package Pack;

public class Categorias {
	private int id;
	private String nombre;
	static int contador = 0;
	
	public Categorias() {
		contador++;
		this.id = contador;
	}
	
	public Categorias(String nombre)
	{
		super();
		contador++;
		this.id = contador;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
