package p1;

import javax.swing.JOptionPane;

import p1.Lista;


public class Main {

	public static void main(String[]args){ 
		Lista nova= new Lista();
		String input=JOptionPane.showInputDialog("Escolha uma das opcoes: 0, 1, 2, 3, 4, 5");
		System.out.println();
		System.out.println("0 - Sair");
		System.out.println("1 - Inserir");
		System.out.println("2 - Eliminar");
		System.out.println("3 - Imprimir");
		int opcao=Integer.parseInt(input);
		while(opcao!=0){
			switch(opcao){
		case 1:
		{
			String nome=JOptionPane.showInputDialog("Nome?");
			int pos=Integer.parseInt(JOptionPane.showInputDialog("Pos?"));
			nova.insereNo(nome, pos);
		}
		break;
		
		case 2:
		{
			String x=JOptionPane.showInputDialog("Nome?");
			nova.eliminar(x);
		}
		break;
		
		case 3:
		{
			nova.imprimirLista();
		}
		break;
	}
		}
	}
}