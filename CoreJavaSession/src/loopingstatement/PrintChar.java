package loopingstatement;
import java.util.Scanner;

public class PrintChar {

	
		void character()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter start point:");
			char s =sc.next().charAt(0);
			System.out.println("Enter the end point:");
			char e =sc.next().charAt(0);
			System.out.println("Alphabets");
			while(s<=e)
			{
				System.out.println(s);
				s++;
				sc.close();
			}
		}
		public static void main(String[] args) {
			PrintChar obj= new PrintChar();
			obj.character();

	}

}
