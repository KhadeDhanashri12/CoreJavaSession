package assignmentonswitch;

import java.util.Scanner;

//3. Write a Java program to input any alphabet and check whether it is vowel or consonant 

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{

	        char ch = 'i';

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println(ch + " is vowel");
	        else
	            System.out.println(ch + " is consonant");


	     }

	}

}
