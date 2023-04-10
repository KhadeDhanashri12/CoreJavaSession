package loopingstatement;
import java.util.Scanner;

public class AdditionNumbers {

	void addNum() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start point:"); //1
		int s=sc.nextInt();
		System.out.println("Enter the end point:"); //3
		int e=sc.nextInt();
		int add=0;
		while(s<=e)
		{
			add=add+s; // 1+2+3 =6
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
