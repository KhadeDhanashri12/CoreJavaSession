package basicsofjava;

public class SeparateOdd {

	public static void main(String[] args) {
		int num=76769;
		int r,odd;
		while(num>0) {
			r=num%10;
	
			if(r%2!=0) {
				System.out.println(r);
			}
			num=num/10;
			
		}

	}

}
