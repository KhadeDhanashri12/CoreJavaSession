package loopingstatement;
import java.util.Scanner;
public class ForLoopExample {

	
		void printNumberForword()
		{
			int i,end=5;
			for(i=1;i<=end;i++)
			{
				System.out.println(i+" " );
			}
			System.out.println("Done");
		}
		void printNumberReverse()
		{
			for(int i=10;i>=1;i--)
			{
				System.out.println(i+" ");
		    }
			System.out.println("Done");
	}
		void factorial()
		{
			int fact=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial is:"+fact);
			
			
		}
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	ForLoopExample obj=new ForLoopExample();
	System.out.println("1. forword print");
	System.out.println("2. reverse print");
	System.out.println(" 3. factorial");
	System.out.println("Enter choice");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		obj.printNumberForword();
		break;
	case 2:
		obj.printNumberReverse();
		break;
	case 3:
	obj.factorial();

	}
}
}
