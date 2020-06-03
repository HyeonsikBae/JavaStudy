package SupSub;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sup array[] = { new Sub1(), new Sub2(), new Sub1() };
		
		for(int i=0;i<array.length;i++){
		    instance(array[i]);
		}
	}
	public static void instance(Sup array) {
		if(array instanceof Sub1) ((Sub1)array).method();
		else if(array instanceof Sub2) ((Sub2)array).method();
	}

}
