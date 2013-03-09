package ex1;

import javax.swing.JOptionPane;

public class Main {


	public static void main(String[]args){ 

		String input=JOptionPane.showInputDialog("Quantos contactos tem?");
		int tam=Integer.parseInt(input);
		Contacto novaLista= new Contacto(tam);


		String input1=JOptionPane.showInputDialog("Escolha uma das opcoes: 0, 1, 2, 3, 4, 5");
		System.out.println();
		System.out.println("0 - Sair");
		System.out.println("1 - Inserir um Email");
		System.out.println("2 - Eliminar um Email");
		System.out.println("3 - Trocar um Email por um novo");
		System.out.println("4 - Imprimir um Email");
		System.out.println("5 - Pesquisar um Email");
		System.out.println("6 - Verificar se esta Vazio");
		System.out.println("7 - Verificar se esta Cheio");
		System.out.println();

		int opcao=Integer.parseInt(input1);


		while(opcao!=0){
			switch(opcao){
			case 1:
			{
				String nome=JOptionPane.showInputDialog("Email a adicionar: ");
				novaLista.Inserir(nome);
			}
			break;

			case 2:
			{
				String nome=JOptionPane.showInputDialog("Email a eliminar: ");
				novaLista.Inserir(nome);
			}
			break;

			case 3:
			{
				input=JOptionPane.showInputDialog("Posiçao a substituir: ");
				int numero=Integer.parseInt(input);


				String nome=JOptionPane.showInputDialog("Email a substituir: ");
				novaLista.Trocar(numero, nome);
			}
			break;

			case 4:
			{
				novaLista.Imprimir();
			}
			break;

			case 5:
			{
				novaLista.Vazia();
			}
			break;

			case 6:
			{
				novaLista.Cheia();
			}
			break;

			case 7:
			{
				String nome=JOptionPane.showInputDialog("Email a pesquisar: ");
				novaLista.Pesquisar(nome);
			}
			break;

			default: JOptionPane.showMessageDialog(null, "Erro");
			}

			System.out.println();
			

			System.out.println();


		}
	}
	


}



