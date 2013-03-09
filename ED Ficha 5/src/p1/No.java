package p1;

public class No {
	
	No Prox=null;
	No Ant=null;
	String novaInfo;
	
	public No(String novaInfo) {
		
	}

	public No getProx() {
		return Prox;
	}

	public void setAnt(No Ant) {
		this.Ant=Ant;		
	}

	public void setProx(No Prox) {
		this.Prox=Prox;
	}

	public String toString(){
		return novaInfo;
	}

	public String getInfo() {
		return novaInfo;
	}

	public No getAnt() {
		return Ant;
	}
}
