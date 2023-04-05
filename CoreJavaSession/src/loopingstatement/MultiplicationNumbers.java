package loopingstatement;

import java.util.Scanner;

public class MultiplicationNumbers {

	void mulNum() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start point:");
		int s=sc.nextInt();
		System.out.println("Enter the end point:");
		int e=sc.nextInt();
		int mul=1;
		while(s<=e)
		{
			mul=mul*s;
			s++;
		}
		System.out.println("Multiplication is:"+mul);
		sc.close();
		}
		
		public static void main(String[] args) {
			MultiplicationNumbers obj=new MultiplicationNumbers();
			obj.mulNum();

	}

}
