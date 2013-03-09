package p3;

import p3.No;

public class Lista {

	No prim;
	No ult;

	public Lista() {
		prim = null;
		ult = null;
	}

	public void addNo(String pal) {
		No novo = new No(pal);
		if (prim == null) {
			prim = novo;
			ult = novo;
		} else {
			ult.setProx(novo);
			novo.setAnt(ult);
			ult = novo;

		}

	}

	public 
}
