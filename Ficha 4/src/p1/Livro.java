package p1;

import javax.swing.JOptionPane;

public class Livro {
	private String titulo;
	private Livro proxTit;
	private String Autor;

	public Livro(String nome, String Autor) {
		nome = titulo;
		this.Autor = Autor;
	}

	public String toString() {
		return titulo + " " + Autor;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setProx(Livro prox) {
		proxTit = prox;
	}

	public Livro getProx() {
		return proxTit;
	}

	public String getAutor() {
		return Autor;
	}
}
