package loopingstatement;
import java.util.Scanner;
public class PrimeDoWhile {

	public static void main(String[] args) {

        int num=7;
        do
        {
            System.out.println(num + " is a prime number");
            num++;
        }
        while(num%2==1);
        
        if(num%2==1)
        {
        do
        { 
            System.out.println(num+ " is NOT a prime number");
            num++;
        }
        while (num%2==0);
    }
        
		
	}
}
	
		
	
	
	