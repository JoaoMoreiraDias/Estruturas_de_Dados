package p2;

import javax.swing.JOptionPane;

public class listaCont {
	private Contacto prim;


	public void inserir(String nome, String num, String mail)
	{
		Contacto novo;
		
		if (prim == null)
		{

			prim = new Contacto(nome, num, mail);
		}
		
		else if (nome.compareTo(prim.getNome())>0)
		{

			novo = new Contacto(nome, num, mail);
			
			{
				novo.setSeg(prim);
				prim=novo;
			}

		}
		
		else
		{
			Contacto temp = prim;
			while(temp.getProx().getNome().compareTo(nome)<0)
			{
				temp=temp.getProx();
			}
		}
			
		
	}
	
	public void listar()
	{
		Contacto temp = prim;
		
		while(temp!=null)
		{
			
		}
		
		}
		
	}
	
}
