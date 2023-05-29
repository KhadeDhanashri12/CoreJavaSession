package Wrapper;

public class ValueOfMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//short,int,long
		
		Integer i1= Integer.valueOf(90);
		
		Integer i2= Integer.valueOf("987");
		
		
		Integer i3= Integer.valueOf("121", 3);//       1*8^2    + 0*8^1 +  1*8^0
//                                                       64    + 0  +  1=65
		
		System.out.println(i3);
		
		
		Float f1=Float.valueOf(98.5f);
		
		
		int a=Integer.parseInt("987");
		System.out.println(a);
		
		
		float f=Float.parseFloat("98.5");
	}


}
