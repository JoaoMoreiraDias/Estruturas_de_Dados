package p2;

public class No {

	No Seg=null;
	int num;

	
	public  No(int num){
		this.num=num;
	}
	
	public int getNum(){
		return num;
	}
	
	public No getSeg(){
		return Seg;
	}

	public void setSeg(No novo) {
		Seg=novo;
	}

}
