package Conexion;

import puntoDos.*;
import puntoTres.Libros;
import puntoUno.Caracteres;

public class Principal {

	public static void main(String[] args) {
		Punto1();
		//Punto2();
		//Punto3();
	}
	
	public static void Punto1() {
		Caracteres ct = new Caracteres();
		ct.pedirF();
	}
	
	public static void Punto2() {
		Ejecutable et = new Ejecutable();
		et.datos();
	}
	
	public static void Punto3() {
		Libros libro1 = new Libros(2905, "StarWars", "Lucas", 1825);
		Libros libro2 = new Libros(2344, "Jurassic World", "Steven", 1946);
		
		System.out.print("\nLIBRO 1: \n");
		System.out.print(libro1.toString());
		System.out.print("\n\nLIBRO 2: \n");
		System.out.print(libro2.toString());
		
		if (libro1.getPaginas() > libro2.getPaginas()) {
			System.out.print("\n\nLibro 1 " + libro1.getTitulo() + " tiene mas paginas que el Libro 2 " + libro2.getTitulo());
			System.out.print("\nLibro 1: " + libro1.getPaginas() + " > " + libro2.getPaginas());
		} else {
			System.out.print("\n\nLibro 2 " + libro2.getTitulo() + " tiene mas paginas que el Libro 1 " + libro1.getTitulo());
			System.out.print("\nLibro 2: " + libro2.getPaginas() + " > " + libro1.getPaginas());
		}
	}
	
}
