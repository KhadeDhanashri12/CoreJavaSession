package classesandobject;

public class Calculator {
	void add(int a, int b)
	{
		System.out.println("Addition is:"+(a+b));
	}
	void multiply(int a,int b) 
	{
		System.out.println("Multiplication is:"+(a*b));
	}
	void subtraction(int a,int b)
	{
		System.out.println("Subtraction is:"+(a-b));	
	}
	void division(int a,int b)
	{
		System.out.println("Division is:"+(a/b));	
	}
	void mod(int a,int b)
	{
		System.out.println("Square is:"+(a%b));	
	}
	void square(int a)
	{
		System.out.println("Mod is:"+(a*a));	
	}

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(21, 21);
		obj.multiply(3,6 );
		obj.subtraction(30, 15);
		obj.division(43,30);
		obj.mod(2, 2);
		obj.square(5);
		
	}

}
