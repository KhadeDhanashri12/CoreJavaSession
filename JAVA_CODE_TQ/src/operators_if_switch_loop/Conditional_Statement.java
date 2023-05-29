package operators_if_switch_loop;

public class Conditional_Statement {

	public static void main(String[] args) {
		int number1 = 4, number2 = 4;

		// only If statement

		if (number1 == number2) // condition
		{ // block start
			// if condition is true if block of statement will execute.
			System.out.println("Hey, Welcome");
		} // block end

		// only if...else statement

		if (number1 != number2) // condition
		{
			// if condition is true if block of statement will execute.
			System.out.println("Hey, Welcome");
		} else {
			// if condition is false else block of statement will execute.
			System.out.println("cute.");
		}

		// if..else..if Statement

		int number3 = 7;

		if (number3 > 0) // condition
		{
			System.out.println("Number is positive.");
		} else if (number3 < 0) // another condition
		{
			System.out.println("Number is negative.");
		} else // any of above condition is not satisfied else block will execute
		{
			System.out.println("Number is 0.");
		}

		// Nested if..else Statement

		int n1 = 5, n2 = 8, n3 = 3, largestNumber;

		if (n1 >= n2) // condition is true if block get executed
		{
			if (n1 >= n3) // nested if-condition is true if block get executed 
			{
				largestNumber = n1;
			} 
			else // nested if-condition is false else block get executed
			{
				largestNumber = n3;
			}
		} 
		else // condition is false else block get executed
		{
			if (n2 >= n3) // nested if-condition is true if block get executed 
			{
				largestNumber = n2;
			} 
			else // nested if-condition is false else block get executed
			{
				largestNumber = n3;
			}
		}

		System.out.println("Largest number is " + largestNumber);


	}

}
