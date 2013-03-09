package p2;

public class Caixote {

	private int Numero;
	private String Tipo;
	private String Dia;
	private String Hora;
	private Caixote Prox;

	public Caixote(int Numero, String Tipo, String Dia, String Hora, String Tipo){
		this.Numero=Numero;
		this.Tipo=Tipo;
		this.Dia=Dia;
		this.Hora=Hora;
		Prox=null;
	}

	public Caixote getProx() {
		return Prox;
	}

	public void setProx(Caixote prox) {
		Prox = prox;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getDia() {
		return Dia;
	}

	public void setDia(String dia) {
		Dia = dia;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}
	
	public String toString(){
		String temp = null;
		temp=temp + Numero + " ";
		temp=temp + Tipo + " ";
		temp=temp + Dia + " ";
		temp=temp + Hora + " ";
		temp=temp + Prox + " ";
		return temp;
		
	}
}
