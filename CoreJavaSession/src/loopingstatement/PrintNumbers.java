package loopingstatement;
import java.util.Scanner;

public class PrintNumbers {
	void printingNum(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start point:");
		int s=sc.nextInt();
		System.out.println("Enter the end point:");
		int e=sc.nextInt();
		while(s<=e) {
			if(s%2==0)
			{
				System.out.println(s+" ");
			}
			s++;
		}
		System.out.println("Done");

		}


	public static void main(String[] args) {
		PrintNumbers obj=new PrintNumbers();
				obj.printingNum();

}
}
