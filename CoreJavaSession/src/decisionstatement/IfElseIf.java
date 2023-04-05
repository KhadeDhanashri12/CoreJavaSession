package decisionstatement;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		
		System.out.println("Enter 1 number:");
		a=sc.nextInt();
		System.out.println("Enter 2 number:");
		b=sc.nextInt();
		System.out.println("Enter 3 number:");
		c=sc.nextInt();
		System.out.println("Enter 4 number:");
		d=sc.nextInt();
		
		if(a>b && a>c && a>d)
			System.out.println("greatest number is:"+a);
		else if(b>a && b>c && b>d)
			System.out.println("greatest number is:"+b);
		else if(c>a && c>b && c>d)
			System.out.println("greatest number is:"+c);
		else 
			System.out.println("greatest number is:"+d);
			

	}

}
