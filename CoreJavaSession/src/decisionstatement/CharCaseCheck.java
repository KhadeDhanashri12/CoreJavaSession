package decisionstatement;

import java.util.Scanner;

public class CharCaseCheck {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet:");
		ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			int i=ch-32;
			System.out.println((char)i);
		}
		else if(ch >= 'A' && ch <='z')
		{
			int i=ch+32;
			System.out.println((char)i);
		}
		else
			System.out.println("please enter valid input...!");

	}

}
