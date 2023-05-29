package Exception;

import java.util.Scanner;

public class Calculator {
	void add(int a, int b) 
	{
	System.out.println("Addition is;"+(a+b));	
	}
	void divide(int a, int b) 
	{
	System.out.println("Divide is:"+(a/b));	
	}
	void substract(int a, int b) 
	{
	System.out.println("Subtraction is:"+(a-b));	
	}
	void multiply (int a, int b) 
	{
	System.out.println("multiplication is:"+(a-b));	
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculator obj=new Calculator ();
		obj.add(a,b);
		try
		{
			obj.divide(a,b);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		

	}

}
