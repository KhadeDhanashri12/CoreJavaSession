package operators_if_switch_loop;

public class Switch_Statement {

	public static void main(String[] args) {
		int Number = 2;

		switch (Number) // variable or expression
		{
		// if variable match with any one of below case
		// Particular case block of statements will get execute
		case 1:
			System.out.println("one");
			break; // break the execution of switch
		// if break is not use below cases get execute till not get break (till end of
		// switch case)
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;

		default:// if variable not match with any one of below case default get execute
			System.out.println("not valid number");
			break;
		}



	}

}
