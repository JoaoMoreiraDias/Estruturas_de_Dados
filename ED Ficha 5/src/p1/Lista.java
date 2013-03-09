package p1;

public class Lista {

	No prim;
	No ult;
	
	public Lista() {
		prim=null;
		ult=null;
	}
	
	public void insereNo (String novaInfo, int pos) {
	No novo = new No(novaInfo);
	{
		if (pos==0)
		{
			prim=novo;
			ult=novo;
		}
		else
		{
			int cPos=1;
			No temp = prim;
			while((cPos!=pos) && (temp.getProx()!=null))
			{
				cPos++;
				temp=temp.getProx();
			}
			novo.setProx(temp.getProx());
			temp.getProx().setAnt(novo);
			novo.setAnt(temp);
			temp.setProx(novo);
			if (temp.getProx()==null){
				ult=temp;
				}
		}
		}
	}
	
	public void imprimirLista () {
		No Temp = prim;
		while (Temp!=null)
		{
			Temp.toString();
			Temp=Temp.getProx();
		}
	}

	public void eliminar (String x)
	{
		No Temp = prim;
		while((Temp.getProx()!=null)&&(Temp.getInfo().compareTo(x)==0))
		{
			Temp.setProx(Temp.getProx());
			Temp.setAnt(Temp.getAnt());
		}
	}
}
