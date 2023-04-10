package assignmentonswitch;

import java.util.Scanner;

public class EvenOdd {

//2.Write a Java program to check whether a number is even or odd using switchcase 
	
	public static void main(String[] args) {
		int numbers=0,Even,Odd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		numbers=sc.nextInt();
		
		switch(numbers%2) {
		case 0:
		System.out.println("Even");
		break;
		case 1:
			System.out.println("Odd");
		}

}
}
