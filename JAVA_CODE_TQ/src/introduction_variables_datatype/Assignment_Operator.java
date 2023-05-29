package introduction_variables_datatype;

public class Assignment_Operator {

	public static void main(String[] args) {
		// Assignment Operator

				int number1, number2;

				// Assigning 5 to number1
				number1 = 5;
				System.out.println(number1);

				// Assigning value of variable number2 to number1
				number2 = number1;
				System.out.println(number2);

				// Arithmetic Operator

				double number3 = 12.5, number4 = 3.5, result;

				// Using addition operator
				result = number3 + number4;
				System.out.println("number3 + number4 = " + result);

				// Using subtraction operator
				result = number3 - number4;
				System.out.println("number3 - number4 = " + result);

				// Using multiplication operator
				result = number3 * number4;
				System.out.println("number3 * number4 = " + result);

				// Using division operator
				result = number3 / number4;
				System.out.println("number3 / number4 = " + result);

				// Using remainder operator
				result = number3 % number4;
				System.out.println("number3 % number4 = " + result);

				// '+' Operator to concate String

				String start, middle, end, result1;

				start = "Welcome!";
				middle = "in Online Training.";
				end = "Thank you...";

				result1 = start + middle + end;
				System.out.println(result1);

				// Unary Operator

				int number5 = 5;
				boolean flag = false;

				// ++number is equivalent to number = number + 1
				System.out.println("number5 = " + ++number5);
				// number is equal to 6 here.

				// -- number is equivalent to number = number - 1
				System.out.println("number5 = " + --number5);
				// number is equal to 5 here.

				System.out.println("!flag = " + !flag);
				// flag is still false.

				System.out.println(number5++);
				System.out.println(number5);

				System.out.println(++number5);
				System.out.println(number5);



	}

}
