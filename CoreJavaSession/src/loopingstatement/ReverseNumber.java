package loopingstatement;
import java.util.Scanner;
public class ReverseNumber {
	void reverseNum() {
	char ch;
	do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		
		while(num!=0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println("reverse number is:"+rev);
		System.out.println("Do You Want to continue???(y/n)");
		ch=sc.next().charAt(0);
	}while(ch=='y'|| ch=='Y');
		
	}
public static void main(String[] args) {
	ReverseNumber obj= new ReverseNumber();
	obj.reverseNum();

	}

}
