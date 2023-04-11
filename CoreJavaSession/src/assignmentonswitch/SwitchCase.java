package assignmentonswitch;

//9.WAP in java using switch case for following: Area of a circle Area of a square 
//Area of a right angled triangle Area of a rectangle Circumference of a circle 
//Perimeter of a square Accept inputs like radius,side,etc through keyboard.
//Menu driven program using switch case:

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		{
			Scanner sc = new Scanner(System.in);

			System.out.println("MENU:");
			System.out.println("1.Area of a Circle");
			System.out.println("2.Area of a Square");
			System.out.println("3.Area of a Right Angled Triangle");
			System.out.println("4.Area of a Rectangle");
			System.out.println("5.Circumference of a Circle");
			System.out.println("6.Perimeter of a Square");
			System.out.println("7.Exit");

			System.out.println("Enter your option:");
			int op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Enter radius:");
				float radius = sc.nextFloat();
				float ac = 3.14f * radius * radius;
				System.out.println("Area:" + ac);
				break;

			case 2:
				System.out.println("Enter side:");
				int x = sc.nextInt();
				int as = x * x;
				System.out.println("Area:" + as);
				break;

			case 3:
				System.out.println("Enter height and base:");
				float h = sc.nextFloat();
				float bs = sc.nextFloat();
				float triangle = 0.5f * h * bs;
				System.out.println("Area:" + triangle);
				break;

			case 4:
				System.out.println("Enter length and breadth:");
				int l = sc.nextInt();
				int b = sc.nextInt();
				int area = l * b;
				System.out.println("Area:" + area);
				break;

			case 5:
				System.out.println("Enter radius:");
				float R = sc.nextFloat();
				float C = 3.14f * 2f * R;
				System.out.println("Circumference:" + C);
				break;

			case 6:
				System.out.println("Enter side:");
				int X = sc.nextInt();
				int p = 4 * X;
				System.out.println("Perimeter:" + p);
				break;

			default:
				System.out.println("enter valid input");
			}
		}
	}

}
