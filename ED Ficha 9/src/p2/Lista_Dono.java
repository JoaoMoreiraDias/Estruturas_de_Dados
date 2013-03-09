package p2;

public class Lista_Dono {

	private Dono primeiro;
	
	public Lista_Dono(){
		
	}
	
	public void addDono(Dono novo){
		if (primeiro == null)
		{
			primeiro=novo;
		}
		else {
			Dono temp=primeiro;
			Dono ant=null;
			while (temp!=null && temp.getNome().compareTo(novo.getNome())>0){
				ant=temp;
				temp=temp.getProx();
			}
			novo.setProx(temp);
			ant.setProx(novo);
		}
	}
}
