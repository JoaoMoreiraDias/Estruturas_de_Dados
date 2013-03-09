package p1;

public class Candidato {
	
	private String nome;
	private String partido;
	private int votos;
	
	public Candidato(String nome, String partido) {
		
		this.nome=nome;
		this.partido=partido;
	}
	
	public String getNome(){
		return nome;
	
	}
	
		
	public void maisVotos(){
		votos=+1;
	}

	public int getVotos() {
		return votos;
	}
}