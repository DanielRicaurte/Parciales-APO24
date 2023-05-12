package Naves;

import Principal.NaveEspacial;

public class Tripuladas  extends NaveEspacial{
	//Crear atributos de la clase o objecto de la realidad
	private int tripulacion;

	//Constructor para inicializar los valores de los atributos de la clase
	public Tripuladas(String nombre, String actividad, String pais, String tipo, String combustible, int tripulacion) {
		super(nombre, actividad, pais, tipo, combustible);
		this.tripulacion = tripulacion;
	}
	
	//Metodos getters y setters para acceder y modificar valores propios de la clase
	public int getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(int tripulacion) {
		this.tripulacion = tripulacion;
	}

	//Metodos para comportamientes de la clase
	@Override
	public void utilidad() {
		
	}

	@Override
	public void toneladas() {
		
	}

	@Override
	public void mision() {
		
	}
	
	//Metodo para devolver los valores de un objecto en una cadena de texto
	@Override
	public String toString() {
		return "\nNave [Nombre = " + nombre + ", Actividad = " + actividad + ", País = " + pais + ", Tipo = " + tipo
				+ ", Combustible = " + combustible + ", Tripulación = " + tripulacion + "]";
	}
}
