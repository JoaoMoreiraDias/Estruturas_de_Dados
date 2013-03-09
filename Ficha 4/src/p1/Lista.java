package p1;

public class Lista {

	Livro prim = null;

	public Lista() {

	}

	private void inserirLivro(String nome, String Autor) {

		Livro novo = new Livro(nome, Autor);
		if (prim == null) {
			prim = novo;
			System.out.println(prim.toString());
		} else if (prim.getTitulo().compareTo(novo.getTitulo()) <= 0) {
			prim.setProx(novo);
		} else {
			Livro temp = prim;
			while (prim.getTitulo() != null
					|| prim.getProx().getTitulo().compareTo(nome) < 0) {
				temp = temp.getProx();
			}
			prim.setProx(novo);
			novo.setProx(prim.getProx());
		}

	}

	private void listar() {
		Livro temp = prim;
		while (temp != null) {
			System.out.println(temp);
			temp = temp.getProx();
		}
	}

	private void listarAutor(String Autor) {
		Livro temp = prim;
		while (temp != null) {
			if (temp.getAutor().compareTo(Autor) == 0)
				System.out.println(temp);
			temp = temp.getProx();
		}
	}

	private void eliminar(String Autor){
		Livro temp = prim;
	    while (temp != null) {
	    if	(temp.getAutor().compareTo(Autor) == 0)
	    		{
	    	
	    		}
	    temp.setProx(temp.getProx());
	    temp=temp.getProx();
	    }
	}
}