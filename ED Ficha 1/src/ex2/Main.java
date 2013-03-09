package ex2;

import javax.swing.JOptionPane;


public class Main {
	

	
		public static void main(String[]args){ 
		
			
		String texto=JOptionPane.showInputDialog("Texto?");
	    String[] palavras=texto.split(" ");
	    int tam=palavras.length;
	   
		
	    int i;
	    int i1;
	    String var;
	    
	    for (i=0 ; i<tam ; i++) {
	    	for (i1=0 ; i1>=tam ; i1--){
	    		var=palavras[i].substring(i1,i1+1);
	    	
	    		System.out.println(var);
	    }
		}
		
	
}
}