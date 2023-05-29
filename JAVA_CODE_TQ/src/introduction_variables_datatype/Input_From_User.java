package introduction_variables_datatype;
import java.util.Scanner;
public class Input_From_User {

	public static void main(String[] args) {
		// create an object of Scanner
				Scanner input = new Scanner(System.in);

				// Getting int input
				System.out.print("Enter integer: ");
				int number = input.nextInt();
				System.out.println("You entered " + number);

				// Getting float input
				System.out.print("Enter float: ");
				float myFloat = input.nextFloat();
				System.out.println("Float entered = " + myFloat);

				// Getting double input
				System.out.print("Enter double: ");
				double myDouble = input.nextDouble();
				System.out.println("Double entered = " + myDouble);

				// Getting String input
				System.out.print("Enter text: ");
				String myString = input.next();
				System.out.println("Text entered = " + myString);

				// Getting char input
				System.out.print("Enter char: ");
				char myChar = input.next().charAt(0);
				System.out.println("char entered = " + myChar);

				// closing the scanner object
				input.close();


	}

}
