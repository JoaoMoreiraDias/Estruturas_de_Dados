package ex1;

public class Contacto {

    private String[] contactos;
    private int i;
    private int tam;
    private int a;
    

    public Contacto(int tam) {
        contactos = new String[tam];
        i = 0;
    }

    public void Inserir(String Novoemail) {
        contactos[i] = Novoemail;
        i++;
    }

    public void Eliminar(String Novoemail) {
        
    
        for (a = 0; a < tam; a++) {
            if( contactos[a].compareTo(Novoemail)==0)
            {
                contactos[a]=contactos[tam];
                    
            }
        }
    }

    public void Trocar(int pos, String Novoemail) {
    	contactos[pos] = Novoemail;
    }

    public void Imprimir() {

        for (a = 0; a < tam; a++) {

            System.out.println(contactos[a]);
        }
    }
    
    public boolean Pesquisar(String Novoemail) {



        boolean statement=true;
		for (a = 0; a < tam; a++) {

            if (contactos[a].compareTo(Novoemail)==0)
            {
                statement = true;
            }
            else
            {
            	 statement = false;
            }
            }
		return  statement;
        }
    
    public boolean Vazia(){
    	
    	boolean statement=true;
		for (a = 0; a < tam; a++) 
		{
			if (contactos[a].compareTo("")==0)
			{
                statement = true;
            }
            else
            {
            	 statement = false;
            	 break;
            }
	    }
		return statement;
		}
    
public boolean Cheia(){
    	
    	boolean statement=true;
		for (a = 0; a < tam; a++) 
		{
			if (contactos[a].compareTo("")!=0)
			{
                statement = true;
            }
            else
            {
            	 statement = false;
            	 break;
            }
	    }
		return statement;
		}
    
}





