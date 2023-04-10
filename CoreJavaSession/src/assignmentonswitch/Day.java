package assignmentonswitch;
import java.util.Scanner;
//5.Write a program that displays the day of the week corresponding to the number
//entered. i.e., 1 - "Monday", 2- "Tuesday" and so on.
public class Day {

	public static void main(String[] args) {
		{
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input number: ");
	        int day = in.nextInt();

	        String dayName=" ";
	        switch (day) {
	            case 1: 
	            	dayName = "Monday"; 
	            	System.out.println(dayName);
	            	break;
	            case 2: 
	            	dayName = "Tuesday"; 
	            	System.out.println(dayName);
	            	break;
	            case 3:
	            	dayName = "Wednesday";
	            	System.out.println(dayName);
	            	break;
	            case 4:
	            	dayName = "Thursday"; 
	            	System.out.println(dayName);
	            	break;
	            case 5:
	            	dayName = "Friday"; 
	            	System.out.println(dayName);
	            	break;
	            case 6: 
	            	dayName = "Saturday";
	            	System.out.println(dayName);
	            	break;
	            case 7: 
	            	dayName = "Sunday";
	            	System.out.println(dayName);
	            	break;
	            default:dayName = "Invalid day range";
	            
	    }

	}

}
}