package p2;

public class Lista_Veiculo {
	
	private Veiculo primeiro;
	
	public void addVeiculo(Veiculo novo){
		if (primeiro == null)
		{
			primeiro=novo;
		}
		else {
			Veiculo temp=primeiro;
			Veiculo ant=null;
			while (temp!=null && temp.getMatricula().compareTo(novo.getMatricula())>0){
				ant=temp;
				temp=temp.getProx();
			}
			novo.setProx(temp);
			ant.setProx(novo);
		}
	}

}
