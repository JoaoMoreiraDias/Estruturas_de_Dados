package p2;

public class Lista {
	
	private Letra primeiro;
	private Letra ult;
	
	
	public Lista()
	{
		primeiro=null;
		ult=null;
	}
	
	public void inserir(String caractere)
	{
		Letra nova=new Letra(caractere);
		
		if (primeiro==null)
		{
			primeiro=nova;
			ult=nova;
		}
		else
		{
			ult.setProx(nova);
			ult=nova;
		}
	}
	
	public void criaListaPalavra(String palavra)
	{
		for (int i=0; i<=palavra.length(); i++)
		{
			inserir(palavra.substring(i, i+1));
		}
	}
	
	public void imprimirLista()
	{
		Letra seguinte=primeiro;
		while (seguinte!=null)
		{
			System.out.println(seguinte);
			seguinte = seguinte.getProx();
		}
	}
	
	public void substitui(short x, String nova)
	{
		Letra seguinte=primeiro;
		int i=0;
		while (seguinte!=null && i<x)
		{
			seguinte=seguinte.getProx();
			i++;
		}
		for (i=0; i<nova.length(); i++)
		{
			
		}
		
		
	}

}
