package Naves;

import Principal.NaveEspacial;

public class Lanzadera extends NaveEspacial{

	//Constructor para inicializar los valores de los atributos de la clase
	public Lanzadera(String nombre, String actividad, String pais, String tipo, String combustible) {
		super(nombre, actividad, pais, tipo, combustible);
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
				+ ", Combustible = " + combustible + "]";
	}

}
