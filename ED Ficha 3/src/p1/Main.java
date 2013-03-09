package p1;

import javax.swing.JOptionPane;


public class Main {

    private static Pessoa prim;

    public static void main(String[] args) {
        String nome_prim = JOptionPane.showInputDialog("Qual o nome do primeiro elemento?");
        prim = new Pessoa(nome_prim);
        System.out.println(prim);

        int escolha = 0;
        while (escolha != 4) {
            escolha = (Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção\n 1-Adicionar proximo nome.\n 2-Imprimir Tudo\n 3-Eliminar um dado nome da lista.\n 4-Trocar um dado nome por um  novo nome.\n")));
            switch (escolha) {
            case 1: {                
                
                Pessoa temp = new Pessoa(JOptionPane.showInputDialog("Qual o nome do proximo elemento?"));
                temp.adicionarProximo(prim);
                prim=temp;

                break;
            }
            case 2: {
                System.out.println(prim);

                break;
            }
            case 3: {
                String nome = JOptionPane.showInputDialog("Qual o nome a eliminar?");
                Pessoa seguinte=prim;
                
                while (seguinte.getNome().compareTo(nome)!=0)
                {
                    seguinte=seguinte.getProx();
                }
        
                break;
                }
            
            case 4: {
                String nome = JOptionPane.showInputDialog("Qual o nome que quer mudar?");
                String Novonome = JOptionPane.showInputDialog("Qual é o novo nome?");
                Pessoa seguinte=prim;
                
                    while (seguinte.getNome().compareTo(nome)!=0)
                    {
                        seguinte=seguinte.getProx();
                        
                    }
                if (seguinte.getProx()!=null)
                {
                seguinte.setNome(Novonome);
                }
                                
                break;
                
            }
            
            case 5: {
                
                break;
                }
            
            case 6: {
                
                break;
                }
    
            case 7: {
        
                break;
                }
            
            
            default: {
            }
            }
        }
    }
}