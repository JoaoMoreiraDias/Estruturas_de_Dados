package p1;

public class Clube {

	private String Nome;
	private String Ano;
	private Socio primSocio;
	private Clube E;
	private Clube D;

	public Clube(String Nome, String Ano)
	{
		this.Nome = Nome;
		this.Ano = Ano;
	}

	public void insererSocio(String Nome, String Num, String Email)
	{
		Socio novo = new Socio(Nome, Num, Email);
		if (primSocio==null)
		{
			primSocio=novo;
		}
		else
		{
			Socio seguinte=primSocio;
			while (seguinte.getProx()!=null)
			{
				seguinte=seguinte.getProx();
			}
			seguinte.setProx(novo);
		}
	}

	public String getNome() {
		return Nome;
	}

	public Clube getE() {
		return E;
	}
	
	public Clube getD() {
		return D;
	}
}
