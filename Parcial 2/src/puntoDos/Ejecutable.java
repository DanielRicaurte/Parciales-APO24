package puntoDos;

import java.util.Scanner;

public class Ejecutable {

	static Scanner cn = new Scanner(System.in);
	static Scanner sn = new Scanner(System.in);
	static String nombre;
	static int edad = 0;
	static int DNI;
	static String sexo;
	static double peso;
	static double altura;
	
	public void datos() {
		cn.useDelimiter("\n");
		System.out.print("¡Bienvenido!");
		System.out.print("\nDigite su nombre: ");
		nombre = cn.nextLine();
		System.out.print("\nDigite su edad: ");
		edad = sn.nextInt();
		System.out.print("\nDigite su sexo Hombre(H) o Mujer(M): ");
		sexo = cn.nextLine();
		System.out.print("\nDigite su peso en Kg: ");
		peso = sn.nextDouble();
		System.out.print("\nDigite su altura en metros: ");
		altura = sn.nextDouble();
		int x = (int) (Math.random() * (99999999 + 10000000));
		DNI = x;
		Personas per1 = new Personas(nombre, edad, DNI, sexo, peso, altura);
		System.out.println("Persona 1:" + per1.getNombre());
		System.out.println("\nEdad: " + per1.getEdad());
		System.out.println("\nDNI: " + per1.getDNI());
		System.out.println("\nSexo: " + per1.getSexo());
		System.out.println("\nPeso Kg: " + per1.getPeso());
		System.out.println("\nAltura m: " + per1.getAltura());
		
	}
}
