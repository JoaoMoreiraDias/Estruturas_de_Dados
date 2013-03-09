package p2;

public class Velocidade {

	private Veiculo apontVeiculo;
	private String data;
	private int hora;
	private int km;
	private Velocidade proxVelocidade;
	private Velocidade proxVelocidadeVeiculo;
	private int kmh;

	public Velocidade(String data, int hora, int km){
		this.data=data;
		this.hora=hora;
		this.km=km;
		kmh=km/hora;
	}
	
	public String toString(){
		return data + " " + "-" +" " + hora + " " + "-"+" "+km;
	}

	public Velocidade getProx() {
		return proxVelocidade;
	}

	public void setProx(Velocidade proxVelocidade) {
		this.proxVelocidade=proxVelocidade;		
	}

	public int getkmh() {
		return kmh;
	}
}