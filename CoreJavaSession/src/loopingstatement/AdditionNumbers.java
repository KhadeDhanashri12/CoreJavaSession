package loopingstatement;
import java.util.Scanner;

public class AdditionNumbers {

	void addNum() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start point:");
		int s=sc.nextInt();
		System.out.println("Enter the end point:");
		int e=sc.nextInt();
		int add=0;
		while(s<=e)
		{
			add=add+s;
			s++;
		}
		System.out.println("Addition is:"+add);
		sc.close();
		}
		
		public static void main(String[] args) {
			AdditionNumbers obj=new AdditionNumbers();
			obj.addNum();

		

	}

}
