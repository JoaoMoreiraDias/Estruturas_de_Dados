package p2;

public class Veiculo {

	private String matricula;
	private Dono apontDono;
	private Veiculo proxVeiculo;
	private Veiculo proxVeoculoDono;
	private Velocidade primVelocidade;
	private Velocidade ultVelocidade;
	
	public Veiculo(String matricula){
		this.matricula= matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public Veiculo getProx() {
		return proxVeiculo;
	}

	public void setProx(Veiculo proxVeiculo) {
		this.proxVeiculo=proxVeiculo;
	}
	
	
}
