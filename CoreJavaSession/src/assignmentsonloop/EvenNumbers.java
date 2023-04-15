package assignmentsonloop;

//1.	 WAP to print even numbers from 121 to 229 using for loop. 
public class EvenNumbers {

	public static void main(String[] args) {
		int n = 229;
		int i = 121;
		{
			for (i = 121; i <= n; i++) {
				if (i % 2 == 0)
					System.out.println(i);
			}

		}

	}
}
