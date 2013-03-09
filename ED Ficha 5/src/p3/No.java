package p3;

public class No {

	No Prox=null;
	No Ant=null;
	String pal;
	
	public No(String pal)
	{
		this.pal=pal;
	}
	
	public void setAnt(No Ant)
	{
		this.Ant=Ant;
	}
	
	public void setProx(No Prox)
	{
		this.Prox=Prox;
	}

	public No getProx()
	{
		return Prox;
	}
	
	public No getAnt()
	{
		return Ant;
	}

	public String getPal()
	{
		return pal;
	}
}
