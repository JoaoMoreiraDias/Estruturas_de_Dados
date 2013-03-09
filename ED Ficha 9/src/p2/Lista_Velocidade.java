package p2;

public class Lista_Velocidade {
	
	private Velocidade primeiro;
	
	public Lista_Velocidade(){
		
	}
	
	public void addVelocidade(Velocidade novo){
		if (primeiro == null)
		{
			primeiro=novo;
		}
		else {
			Velocidade temp=primeiro;
			Velocidade ant=null;
			while (temp!=null && temp.getkmh()<novo.getkmh()){
				ant=temp;
				temp=temp.getProx();
			}
			novo.setProx(temp);
			ant.setProx(novo);
		}
	}
	
}
