package Principal;

public abstract class NaveEspacial {
	//Crear atributos de la clase o objecto de la realidad
	protected String nombre;
	protected String actividad;
	protected String pais;
	protected String tipo;
	protected String combustible;
	
	//Constructor para inicializar los valores de los atributos de la clase
	public NaveEspacial(String nombre, String actividad, String pais, String tipo, String combustible) {
		this.nombre = nombre;
		this.actividad = actividad;
		this.pais = pais;
		this.tipo = tipo;
		this.combustible = combustible;
	}
	
	//Metodos getters y setters para acceder y modificar valores de los objectos creados con la clase
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	//Metodos abstractos para comportamientes de la clase
	public abstract void utilidad();
	
	public abstract void toneladas();
	
	public abstract void mision();
}
