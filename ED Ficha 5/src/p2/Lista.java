package p2;

import p2.No;

public class Lista {
	No prim;
	No menor;

	public Lista()
	{
		prim=null;
		menor=null;
	}
	
	public void insereNo (int num)
	{
		No novo= new No(num);
		if (prim==null)
		{
			prim=novo;
			menor=prim;
		}
		else
		{
			if (novo.getNum()>prim.getNum())
			{
				No seg=prim;
				while (seg.getSeg()!=menor)
				{
					seg=seg.getSeg();
				}
				seg.setSeg(novo);
				novo.setSeg(menor);
				
			}
			else
			{
				novo.setSeg(menor.getSeg());
				menor.setSeg(novo);
			}
		}
		{

		}
	}

	public void imprimir()
	{
		No temp = prim;
		while (temp!=null)
		{
			System.out.println(temp.getNum());
			temp=temp.getSeg();
		}
	}
}