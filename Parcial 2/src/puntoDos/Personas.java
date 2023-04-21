package puntoDos;

public class Personas {

	String nombre;
	int edad;
	int DNI;
	String sexo = "H";
	double peso = 0, altura = 0;

	public Personas(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Personas(String nombre, int edad, int DNI, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Personas() {
		
	}

	public double calcularIMC(double pesoIdeal) {
		pesoIdeal = peso / (Math.pow(altura, 2));
		if (pesoIdeal < 20)
			return -1;
		if (pesoIdeal >= 20 && pesoIdeal <= 25)
			return 0;
		if (pesoIdeal > 25)
			return 1;
		return pesoIdeal;
	}

	public String esMayorDeEdad() {
		if (edad >= 18)
			return "Es mayor de Edad";
		if (edad < 18)
			return "Es menor de Edad";
		return null;
	}

	public String comprobarSexo(char sexo) {
		if (sexo == 'H')
			return "H";
		if (sexo == 'h')
			return "H";
		if (sexo == 'M')
			return "M";
		if (sexo == 'm')
			return "M";
		return "H";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getDNI() {
		return DNI;
	}
}

