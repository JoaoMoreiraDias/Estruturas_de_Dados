package p2;

public class Contacto {

	private String nome;
	private String num;
	private String mail;
	private Contacto prox;
		
	public Contacto(String nome, String num, String mail)
    {
        this.nome=nome;
        this.num=num;
        this.mail=mail;
    }

	public void setSeg(Contacto prox) {
		this.prox=prox;
		
	}

	public String getNome() {
		return nome;
	}

	public Contacto getProx() {
		return prox;
	}
}
