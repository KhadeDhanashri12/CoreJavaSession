package Wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		Integer i1= new Integer(x);  //boxing 1.5
		
		Integer i2=100;     //autoboxing
		
		Integer a=new Integer(1000);
		int a1=a.intValue();   //unboxing  1.5
		
		int a2=a;
		System.out.println(a2);   //auto unboxing
		
		System.out.println(i1.equals(i2));
		
		System.out.println(i1==i2);  //memory location
		
		
		Float f=new Float("98.5");  //3 constructors
		System.out.println(f);
		
		Character ch= new Character('a');
		
		Long l=  new Long("900000");
		System.out.println(l);


	}

}
