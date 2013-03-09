package p1;

public class Socio {
	
	private String Nome;
	private String Ano;
	private Socio proxS;
	
	public Socio(String Nome, String Ano){
		this.Nome=Nome;
		this.Ano=Ano;
	}
	
	public void setproxS(Socio novo){
		novo=proxS;
	}
}
