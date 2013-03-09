package p2;

public class Letra {
	
	private String Letra;
	private Letra prox;
	
	public Letra(String novaLetra)
	{
		Letra=novaLetra;
	}
	
	public String getLetra()
	{
		return Letra;
	}
	
	public void setLetra(String novaLetra)
	{
		Letra=novaLetra;
	}
	
	public Letra getProx()
	{
		return prox;
	}
	
	public void setProx(Letra nova)
	{
		prox=nova;
	}

}