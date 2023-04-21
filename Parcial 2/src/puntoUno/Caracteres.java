package puntoUno;

import java.util.Scanner;

public class Caracteres {

	static Scanner cn = new Scanner(System.in);
	static String frase;
	
	public void pedirF() {
		cn.useDelimiter("\n");
		System.out.print("¡Bienvenido!");
		System.out.print("\nDigite una frase: ");
		frase = cn.nextLine();
		char[] arrayCaracteres = frase.toCharArray();
		System.out.println("Los elementos del array son:");
        for (char c : arrayCaracteres) {
            System.out.println(c);
        }
	}
}
