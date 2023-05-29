package operators_if_switch_loop;

public class Do_While {

	public static void main(String[] args) {
		// do
				// {
				// codes inside body of do while loop
				// } while (condition);

				int i = 1;

				do {
					// do while loop get execute at least once then it will check condition
					System.out.println("Num " + i);
					++i; // increment or decrement depend on your condition

					// loop gets executed till condition is true
				} while (i <= 10); // condition

				// Program to find the sum of natural numbers from 1 to 10.

				int sum = 0, j = 10;

				do {
					sum += j; // sum = sum + j;
					--j;

				} while (j != 0);

				System.out.println("Sum = " + sum);

	}

}
