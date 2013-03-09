package p1;

import p1.Eleicao;

public class Eleicao {
	
	
	private String nomeEleicao;
	private String dataEleicao;
	private Candidato Vencedor;
	private Candidato novo;
	private Candidato[] candidatos;
	private int i=0;
	private int tam;
	

		
	public Eleicao (int tam) {
		candidatos = new Candidato[tam];
		this.tam=tam;
				       }

	private void inserirCandidato(Candidato novo) {
		this.novo=candidatos[i];
		i++;
	}

	private void inserirVoto(String nomeVoto){
		for (i = 0; i < tam; i++) 
		{
			if (nomeVoto.compareTo(candidatos[i].getNome())==0) 
			{
				candidatos[i].maisVotos();
			}
			else
			{
				System.out.println("Erro! Candidato nao existe!");
			}
			
		}
		}
	
	private void imprimirResultados() {
		for (i = 0; i < tam; i++)
		{
			System.out.println(candidatos[i].getNome()+" - "+ candidatos[i].getVotos());
		}
		
		for (i = 0; i < tam; i++)
		{
		 int votoVencedor=-1;
		 if (candidatos[i].getVotos()>votoVencedor)
		 {
			 Vencedor=candidatos[i];
			 votoVencedor=candidatos[i].getVotos();
		 }
		}
		
		System.out.println("O vencedor e: "+Vencedor.getNome()+" com "+Vencedor.getVotos());
		
		}
}
	


