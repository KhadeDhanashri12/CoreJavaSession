package assignmentsonloop;
//2.	 WAP to print odd numbers from 521 to 229 using while loop. 
public class OddNumbers {

	public static void main(String[] args) {
		int num=521;
		int i=229;
		while(num>=i) {
			if(num%2==1) {
				System.out.println(num);
			}
			num--;
		}

	}

}
