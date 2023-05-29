package introduction_variables_datatype;

public class Equality_Relational_Operator {

	public static void main(String[] args) {
		int number1 = 5, number2 = 6, number3 = 9;
		boolean result;

		System.out.println("number2 is greater than number1." + (number1 == number2));

		System.out.println("number2 is greater than number1." + (number1 != number2));

		System.out.println("number2 is greater than number1." + (number1 < number2));

		System.out.println("number1 is greater than number2." + (number1 > number2));

		System.out.println("number2 is greater than number1." + (number1 < number2));

		// Logical Operators

		// At least one expression needs to be true for the result to be true
		result = (number1 > number2) || (number3 > number1);

		// result will be true because (number1 > number2) is true
		System.out.println(result);

		// All expression must be true from result to be true
		result = (number1 > number2) && (number3 > number1);

		// result will be false because (number3 > number1) is false
		System.out.println(result);

		// Ternary Operator

		int februaryDays = 29;
		String result1;

		// variable = Condition ? true statement : false statement

		result1 = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(result1);


	}

}
