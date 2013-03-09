package p1;

import javax.swing.JOptionPane;

public class Lista {
	private Tipo primT;

	public Lista(){

	}

	public void addTipo(){
		String TipoS=JOptionPane.showInputDialog("Tipo de Socio?");
		String input=JOptionPane.showInputDialog("Quota a pagar?");
		int Valor=Integer.parseInt(input);
		Tipo novo = new Tipo(TipoS, Valor);

		if (primT==null){
			novo=primT;
		}
		else {
			Tipo temp = primT;
			while (temp.getValor()<novo.getValor() && temp!=null) {
				temp=temp.getproxT();
			}
			novo.setProx(temp.getproxT());
			temp.setProx(novo);
		}
	}

	public void addSocio(){
		String Nome=JOptionPane.showInputDialog("Nome?");
		String Ano=JOptionPane.showInputDialog("Ano?");
		Socio novo=new Socio(Nome, Ano);
		String TipoS=JOptionPane.showInputDialog("Tipo?");

		Tipo temp = primT;

		while (temp.getTipoS()!=TipoS && temp!=null){
			temp=temp.getproxT();
		}
		novo.setproxS(temp.getPrimS());
		temp.setPrimS(novo);
	}
}
