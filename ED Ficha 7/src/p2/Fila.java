package p2;

import p2.Caixote;

public class Fila {
	private Caixote Ultimo;
	private Caixote Primeiro;

	public Fila(){
		Ultimo=null;
		Primeiro=null;
	}

	public void addCaixote(Caixote novo){
		if (Ultimo==null){
			novo=Primeiro;
			novo=Ultimo;
			else{
				if (){

				}
			}

		}
	}

	public void elimCaixote(int tam){
		while (tam>0){
			Primeiro=Primeiro.getProx();
			tam--;
		}
	}
}
