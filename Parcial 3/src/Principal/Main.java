package Principal;

import java.util.Scanner;
import Naves.Lanzadera;
import Naves.NoTripuladas;
import Naves.Tripuladas;

public class Main {
	// static Scanner sn = new Scanner(System.in);
	private static NaveEspacial[] numNaves = new NaveEspacial[9];

	public static void main(String[] args) {
		try {
			Scanner sn = new Scanner(System.in);
			boolean salir = false;
			while (!salir) {
				System.out.println("\n¡Bienvenido al mundo espacial!");
				System.out.println("¿Que deseas hacer el dia de hoy?");
				System.out.println("1. Crear una nueva nave");
				System.out.println("2. Buscar una nave");
				System.out.println("3. Salir");
				System.out.print("Ingrese la opción deseada: ");
				int opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					crearNave();
					break;
				case 2:
					buscarNave();
					break;
				case 3:
					System.out.println("Ok, no hay problema. Vuelva pronto =)");
					salir = true;
					break;
				default:
					System.out.println("ERROR: Opción inválida. Por favor, seleccione una opción válida.");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR: Opción inválida. Por favor, seleccione una opción válida.");
		}
	}

	private static void crearNave() {
		try {
			Scanner sn = new Scanner(System.in);
			NaveEspacial nave = null;
			String nombre, actividad, pais, combustible, tipo;
			int tripulacion;

			System.out.println("\n¡Bienvenido Departamento de Creacion de Naves!");
			System.out.println("Escoge el tipo de Nave que quieres crear: ");
			System.out.println("1. Lanzadera (Transporte de carga)");
			System.out.println("2. No Tripulada (Exploración, Observacion, Comunicación, Investigación)");
			System.out.println("3. Tripulada (Transporte de astronautas para misiones)");
			System.out.print("Ingrese el tipo de nave a crear: ");
			int tipoNave = sn.nextInt();

			switch (tipoNave) {
			case 1:
				System.out.print("Ingrese el nombre de la nave : ");
				nombre = sn.next();
				System.out.print("Ingrese el tipo en años de actividad de la nave: ");
				actividad = sn.next();
				System.out.print("Ingrese el pais de la nave: ");
				pais = sn.next();
				System.out.print("Ingrese el combustible que usa la nave: ");
				combustible = sn.next();
				tipo = "Lanzadera";
				nave = new Lanzadera(nombre, actividad, pais, tipo, combustible);
				break;
			case 2:
				System.out.print("Ingrese el nombre de la nave: ");
				nombre = sn.next();
				System.out.print("Ingrese el tipo en años de actividad de la nave: ");
				actividad = sn.next();
				System.out.print("Ingrese el pais de la nave: ");
				pais = sn.next();
				System.out.print("Ingrese el combustible que usa la nave: ");
				combustible = sn.next();
				tipo = "No Tripulada";
				nave = new NoTripuladas(nombre, actividad, pais, tipo, combustible);
				break;
			case 3:
				System.out.print("Ingrese el nombre de la nave: ");
				nombre = sn.next();
				System.out.print("Ingrese el tipo en años de actividad de la nave: ");
				actividad = sn.next();
				System.out.print("Ingrese el pais de la nave: ");
				pais = sn.next();
				System.out.print("Ingrese el combustible que usa la nave: ");
				combustible = sn.next();
				System.out.print("Ingrese el tripulantes que puden ir abordo de la nave: ");
				tripulacion = sn.nextInt();
				tipo = "Tripulada";
				nave = new Tripuladas(nombre, actividad, pais, tipo, combustible, tripulacion);
				break;
			default:
				System.out.println("Tipo de nave inválido.");
				break;
			}

			if (nave != null) {
				for (int i = 0; i < numNaves.length; i++) {
					if (numNaves[i] == null) {
						numNaves[i] = nave;
						System.out.println("Nave creada y agregada al inventario.");
						break;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR: Opción inválida. Por favor, seleccione una opción válida.");
		}
	}

	private static void buscarNave() {
		try {
			Scanner sn = new Scanner(System.in);
			System.out.println("\n¡Bienvenido al almacen de naves!");
			System.out.println("Aqui podras encontrar todas tus naves segun el nombre");
			System.out.print("Ingrese el nombre de la nave a buscar: ");
			String nombre = sn.next();

			boolean naveEncontrada = false;
			for (NaveEspacial nave : numNaves) {
				if (nave != null && nave.getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("Nave encontrada:");
					System.out.println(nave.toString());
					naveEncontrada = true;
					break;
				}
			}

			if (!naveEncontrada) {
				System.out.println("No se encontró ninguna nave con ese nombre.");
			}
		} catch (Exception e) {
			System.out.println("ERROR: Opción inválida. Por favor, seleccione una opción válida.");
		}
	}
	/*
	 * public static void main(String[] args) { try {//Se encasula el codigo y en
	 * caso de error se transfiere al catch //Creacion de objetos con sus
	 * respectivos valores Lanzadera lanzadera1 = new Lanzadera("Delta IV",
	 * "2002-Act.", "EE.UU.", "Lanzadera", "Queroseno+O(liq)"); NoTripuladas
	 * noTripulada1 = new NoTripuladas("Sputnik", "1957-1958", "Rusia",
	 * "No Tripulada", "Ninguno"); Tripuladas tripulada1 = new Tripuladas("Shenzou",
	 * "1999-Act.", "China", "Tripulada", "N2O4+MMH", 3); Lanzadera lanzadera2 = new
	 * Lanzadera("Ariane V", "1996-Act.", "Europa", "Lanzadera",
	 * "Sólido+N(liq.)+O(liq.)");
	 * 
	 * //Mostrar por consola los objectos con sus respectivos datos
	 * System.out.print(lanzadera1.toString());
	 * System.out.print(noTripulada1.toString());
	 * System.out.print(tripulada1.toString());
	 * System.out.print(lanzadera2.toString());
	 * 
	 * }catch (Exception e) {//Se muestra el error
	 * System.out.print("ERROR: Uno de los datos de las naves esta mal digitado"); }
	 */
}
