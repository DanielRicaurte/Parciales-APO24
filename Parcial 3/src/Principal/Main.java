package Principal;

import Naves.Lanzadera;
import Naves.NoTripuladas;
import Naves.Tripuladas;

public class Main {

	public static void main(String[] args) {
		try {//Se encasula el codigo y en caso de error se transfiere al catch
		//Creacion de objetos con sus respectivos valores
		Lanzadera lanzadera1 = new Lanzadera("Delta IV", "2002-Act.", "EE.UU.", "Lanzadera", "Queroseno+O(liq)");
		NoTripuladas noTripulada1 = new NoTripuladas("Sputnik", "1957-1958", "Rusia", "No Tripulada", "Ninguno");
		Tripuladas tripulada1 = new Tripuladas("Shenzou", "1999-Act.", "China", "Tripulada", "N2O4+MMH", 3);
		Lanzadera lanzadera2 = new Lanzadera("Ariane V", "1996-Act.", "Europa", "Lanzadera", "Sólido+N(liq.)+O(liq.)");
		
		//Mostrar por consola los objectos con sus respectivos datos
		System.out.print(lanzadera1.toString());
		System.out.print(noTripulada1.toString());
		System.out.print(tripulada1.toString());
		System.out.print(lanzadera2.toString());
		
		}catch (Exception e) {//Se muestra el error
			System.out.print("ERROR: Uno de los datos de las naves esta mal digitado");
		}
	}
}
