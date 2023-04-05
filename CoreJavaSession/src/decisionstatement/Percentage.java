package decisionstatement;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		double a;
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter a Percentage:");
		a=sc.nextDouble();
		
		if(a>=70) 
			System.out.println("Distinction");
		else if(a>=60)
			System.out.println("fist class");
		else if(a>=50)
			System.out.println("second class");
		else if(a>=35)
			System.out.println("pass class");
		else
			System.out.println("fail");			
				
	}

}
