package p2;

public class Dono {

	private String nomeDono;
	private String moradaDono;
	private Dono proxDono;
	private Veiculo primVeiculo;

	public Dono(String nomeDono, String moradaDono){
		this.nomeDono=nomeDono;
		this.moradaDono=moradaDono;
	}

	public String getNome() {
		return nomeDono;
	}

	public Dono getProx() {
		return proxDono;
	}

	public void setProx(Dono proxDono) {
		this.proxDono=proxDono;		
	}
}
