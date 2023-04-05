package loopingstatement;

import java.util.Scanner;

public class CharReverse {
	void character()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start point:");
		char s =sc.next().charAt(0);
		System.out.println("Enter the end point:");
		char e =sc.next().charAt(0);
		System.out.println("Reverse Char");
		while(s>=e)
		{
			System.out.println(s);
			s--;
			sc.close();
		}
	}

	public static void main(String[] args) {
		CharReverse obj=new CharReverse();
		obj.character();
	}

}
