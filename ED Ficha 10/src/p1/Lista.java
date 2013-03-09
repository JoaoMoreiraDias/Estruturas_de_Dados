package p1;

public class Lista {

	private Clube raiz;
	
	public Lista(String Nome, String Ano)
	{
		Clube raiz= new Clube(Nome, Ano);
	}
	
	public void inserirClube(String Nome, String Ano)
	{
		Clube novo = new Clube(Nome, Ano);
	}
	
	public void insererSocio(String Nome, String Num, String Email)
	{
		Clube temp=raiz;
		while( temp != null ) {
            if( Nome.compareTo( temp.getNome() ) < 0 )
            	temp = temp.getE();
            else if( Nome.compareTo( temp.getNome() ) > 0 )
            	temp = temp.getD();
            else
            	 temp.insererSocio(Nome, Num, Email); 
        }
        
	}
}
