package p1;

import java.util.Stack;

public class Vestuario {
	private Stack Fichas;
	private Casaco primerio;
	private int[] tempos = new int[50];

	public Vestuario(){
		for (int i=1; i<=50; i++){
			tempos[i]=0;
			Fichas.push((Integer)i);
		}
	}
	
	public void popCasaco(){
		if (Fichas.empty()=true){
			System.out.println("Esta vazio!");
		}
		else {
			Fichas.pop();
		}
	}
}
