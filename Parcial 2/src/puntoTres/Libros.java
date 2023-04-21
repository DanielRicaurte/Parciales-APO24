package puntoTres;

public class Libros {
	
	int ISBN;
	String Titulo;
	String Autor;
	int paginas;
	
	public Libros(int iSBN, String titulo, String autor, int paginas) {
		super();
		ISBN = iSBN;
		Titulo = titulo;
		Autor = autor;
		this.paginas = paginas;
	}
	
	public String toString() {
		return "Titulo: " + Titulo + "\nISBN: " + ISBN + "\nAutor: " + Autor + "\nPaginas: " + paginas;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
}
