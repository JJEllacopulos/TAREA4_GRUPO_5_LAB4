package Pack;

public class Peliculas {
	private int id;
	private String nombre;
	private Categorias categorias;
	static int contador = 0;
	
	public Peliculas() {
		contador++;
		this.id = contador;
		this.nombre = "";
		this.categorias = new Categorias();
	}
	
	public Peliculas(String nombre, Categorias categorias)
	{
		super();
		contador++;
		this.id = contador;
		this.nombre = nombre;
		this.categorias = categorias;
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
	public Categorias getCategorias() {
		return categorias;
	}
	public void setCategorias(Object object) {
		this.categorias = (Categorias) object;
	}

	@Override
	public String toString() {
		return id+"- " + nombre+ " "+categorias.getNombre();
	}
	
	
}
