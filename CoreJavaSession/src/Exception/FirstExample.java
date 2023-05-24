package Exception;
import java.util.Scanner;

public class FirstExample {
	void add(int a,int b)
	{
		System.out.println(" Addition is: "+(a+b));
	}
	void multiply(int a,int b)
	{
		System.out.println("multiplication is:" +(a*b));
	}
	void divide(int a,int b)
	{
		System.out.println("Division is:"+(a/b));
	}
	void subtract(int a,int b)
	{
		System.out.println("subtraction is:"+(a-b));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		FirstExample obj= new FirstExample();
		obj.add(a, b);
		obj.multiply(a, b);
		try {
		obj.divide(a, b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		obj.subtract(a, b);
		
		}
	}


