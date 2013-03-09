package p1;

public class ADTPilha {

	private No Top;

	public ADTPilha(){
		Top=null;
		Bot=null;
	}

	public void Push(No novoNo){
		novoNo.setProx(Top);
		Top=novoNo;
	}

	public No Pop(){
		No temp=Top;
		Top=Top.getProx();
		return temp;
	}


	public No getUltimo() {
		return Top;
	}
}
