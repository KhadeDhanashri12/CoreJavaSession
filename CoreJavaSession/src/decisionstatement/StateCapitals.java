package decisionstatement;
import java.util.Scanner;
public class StateCapitals {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a state name: ");
		String state=sc.nextLine();
		
		state=state.toLowerCase();//a+=5
		
		switch(state)
		{
		case "maharashtra":
			System.out.println("Mumbai");
			break;
		case "gujarat":
			System.out.println("Gandhinagar");
			break;
		case "madhya pradesh":
			System.out.println("Bhopal");
		case "goa":
			System.out.println("Panaji");
			break;
		case "karnataka":
			System.out.println("Bangalore");
			break;
			default: System.out.println("Enter valid state...!!!");
		}


	}

}
