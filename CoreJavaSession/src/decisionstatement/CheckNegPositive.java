package decisionstatement;

public class CheckNegPositive {

	public static void main(String[] args) {
		int i = 120;
		if (i > 0)
			if (i % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");

		else
			System.out.println("given number is negative...Enter psitive number");

	}

}
