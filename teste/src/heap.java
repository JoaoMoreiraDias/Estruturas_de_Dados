/**
 * Método Heal-Sort - ordena um array de Strings.
 * 
 * @author João Moreira Dias
 * @version Sexta-feira, 8 de Junho de 2012
 */
public class heap{
    /**
     * Método main - o main do programa.
     * 
     * @param   Nada  Não Tem
     */    
    public static void main(){
        //Declaração do indice.
        int i;
        
        //Declaração de uma array de contactos.
        String arr[] = {"Abilio", "Isabel", "Ricardo", "Paula", "Fernando"};

        //Imprimir uma introdução ao codigo
        System.out.println("15) Implementar o método Heap-Sort, para ordenação de um conjunto de");
        System.out.println("registos (em cada registo, a chave é um nome com, até 15 caracteres).");
        System.out.println("O programa deverá apresentar os passos principais do processo de ordenação.\n\n");;
        System.out.println("Por: João Moreira Dias - 24972");
        System.out.println("Universidade Portucalense Infante D. Henrique\n\n");

        System.out.println("Array Não-ordenada\n---");

        //Ciclo para escrever a array não ordenada.      
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        //Ciclo para carrega a array e o upper bound da mesma para a funcao de ordenamento.
        for(i=arr.length; i>1; i--){
            fnSortHeap(arr, i - 1);
        }

        System.out.println("\n\n\nArray Ordenada\n---");

        //Ciclo para escrever a array ordenada.
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        System.out.println("\n\n-FIM-");
    }

    /**
     * Método fnSortHeap - Função de ordenamento por método Heap-Sort.
     * 
     * @param  array[]      A array de stings que é passada pelo main.
     * @param  arr_ubound   Número de indice do upper bond da array passada como parametro.
     */
    public static void fnSortHeap(String array[], int arr_ubound){
        //Declaração do indice i.
        int i;
        
        //Declaração do indice a.
        int a;
        
        //Declaração do filho esquerdo.
        int filhoE;
        
        //Declaração do filho direito. 
        int filhoD;
        
        //Declaração do filho minimo.
        int filhoM;
        
        //Declaração da raiz.
        int raiz;
        
        //Declaração de uma String de armazenamento de dados temporaria.
        String temp;
        
        //Dar o valor da raiz para ser no meio dos valores da array
        raiz = (arr_ubound-1)/2;

        //Ciculo para percorer a heap
        
        //
        for(a = raiz; a >= 0; a--){
            for(i=raiz; i>=0; i--){
                filhoE = (2*i)+1;
                filhoD = (2*i)+2;
                if((filhoE <= arr_ubound) && (filhoD <= arr_ubound)){
                    if(array[filhoD].compareTo (array[filhoE])>=0)
                        filhoM = filhoD;
                    else
                        filhoM = filhoE;
                }
                else{
                    if(filhoD > arr_ubound)
                        filhoM = filhoE;
                    else
                        filhoM = filhoD;
                }

                if(array[i].compareTo(array[filhoM])<0){
                    //As seguintes linhas de código são um "swap" entre o array[i] e o filhoM. Onde o filhoM é actualizdo
                    temp = array[i];
                    array[i] = array[filhoM];
                    array[filhoM] = temp;
                }
            }
        }
        
        //As seguintes linhas de codigo são um "swap" entre attay[0] e o array[arr_ubound]
        temp = array[0];
        array[0] = array[arr_ubound];
        array[arr_ubound] = temp;
        
        return;
    }
}