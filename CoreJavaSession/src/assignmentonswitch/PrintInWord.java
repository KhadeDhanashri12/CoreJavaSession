package assignmentonswitch;

import java.util.Scanner;

public class PrintInWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print(" Enter the number between 1-5");
        int numbers= in.nextInt();
        
        switch(numbers) {
        case 1:
        System.out.println("ONE");
        break;
        case 2:
            System.out.println("TWO");
            break;
        case 3:
            System.out.println("THREE");
            break;
        case 4:
            System.out.println("FOUR");
            break;
        case 5:
            System.out.println("FIVE");
            break;
            default:
            	System.out.println("Enter valid number");
            
        
        
        }

	}

}
