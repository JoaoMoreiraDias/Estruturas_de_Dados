package p1;

import javax.swing.JOptionPane;

public class Tipo {

	private String TipoS;
	private int Valor;
	private Socio PrimS;
	private Tipo proxT;

	public Tipo(String TipoS, int Valor){
		this.TipoS=TipoS;
		this.Valor=Valor;
	}

	public int getValor(){
		return Valor;
	}

	public Tipo getproxT(){
		return proxT;
	}

	public void setProx(Tipo proxT){
		this.proxT=proxT;
	}

	public String getTipoS(){
		return TipoS;
	}

	public Socio getPrimS(){
		return PrimS;
	}
	
	public void setPrimS(Socio novo){
		PrimS=novo;
	}
}
