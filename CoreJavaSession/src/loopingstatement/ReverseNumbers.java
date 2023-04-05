package loopingstatement;

import java.util.Scanner;

public class ReverseNumbers {
	void revNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int s = sc.nextInt();
		System.out.println("Enter the end point:");
		int e = sc.nextInt();
		
		while (s >= e)
			if (s % 2 == 0) {

				System.out.println(s + " ");

			}
		s++;

		System.out.println(s);

	}

	public static void main(String[] args) {
		ReverseNumbers obj = new ReverseNumbers();
		obj.revNum();

	}
}
