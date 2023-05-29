package operators_if_switch_loop;

public class While_Loop {

	public static void main(String[] args) {
		// while (condition)
				// {
				// codes inside body of while loop
				// }

				// Program to print 10 numbers

				int i = 1;

				while (i <= 10) // condition
				{
					// loop gets executed till condition is true
					System.out.println("Num " + i);
					++i; // increment or decrement depend on your condition
				}

				// Program to find the sum of natural numbers from 1 to 10.

				int sum = 0, j = 10;

				while (j != 0) 
				{
					sum += j; // sum = sum + j;
					--j;
				}
				
				System.out.println("Sum = " + sum);

	}

}
