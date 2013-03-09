package p1;

public class Socio {

	private String Nome;
	private String Num;
	private String Email;
	private Socio Prox;
	
	public Socio(String Nome, String Num, String Email)
	{
		this.Nome=Nome;
		this.Num=Num;
		this.Email=Email;
	}
	
	public Socio getProx()
	{
		return Prox;
	}
	
	public void setProx(Socio novo)
	{
		Prox=novo;
	}
}
