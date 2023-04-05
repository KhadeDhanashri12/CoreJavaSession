package loopingstatement;

import java.util.Scanner;

public class EvenOddAddition {
	void Addition()
	{
		int s,e;
		int even=0,odd=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		 s = sc.nextInt();
		System.out.println("Enter the end point:");
		 e = sc.nextInt();
		System.out.println("Addition");
		while(s<=e)
		{
			if(s%2==0)
			{
				 even = even+s;
			}
			else
			{
				 odd=odd+s;
			}
			s++;
		}
	

	  System.out.println("Addition of even: "+even);

	  System.out.println("Addition of odd: "+odd);
		
	}
	public static void main(String[] args) {
		EvenOddAddition obj= new EvenOddAddition();
		obj.Addition();
	}

}
