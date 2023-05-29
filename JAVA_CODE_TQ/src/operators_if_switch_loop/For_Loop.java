package operators_if_switch_loop;

public class For_Loop {

	public static void main(String[] args) {
		// for (initialization ; Condition ; increment or decrement)
				// {
				// codes inside for loop's body
				// }

				// Program to print a sentence 10 times

				for (int i = 1; i <= 10; i++) //loop gets executed till condition is true 
				{
					System.out.println("Statement " + i);
				}

				// Program to find the sum of even numbers from 1 to 10.

				int sum = 0;

				for (int i = 1; i <= 10; i += 2) // i=i+2;
				{
					sum += i; // sum = sum + i
				}

				System.out.println("Sum = " + sum);

				// Infinite for Loop

			for (int i = 1; i <= 10; i++) 
				{
					System.out.println("Hello");
				}

	}

}
