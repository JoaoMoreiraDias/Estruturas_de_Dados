package p1;

public class No {
	private No Prox;
	private String palavra;

	public No(String palavra){
		this.palavra=palavra;
	}

	public void setProx(No novoNO) {
		Prox=novoNO;
	}

	public No getProx() {
		return Prox;
	}
	
	public String getPalavra(){
		return palavra;
	}

	
}
