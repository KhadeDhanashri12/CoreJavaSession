package assignmentsonloop;

import java.util.Scanner;

//7.	 Write a program to find sum of all odd numbers between 1 to n.
public class SumOdd {

	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	}

