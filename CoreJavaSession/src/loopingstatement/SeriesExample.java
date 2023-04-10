package loopingstatement;
import java.util.Scanner;
public class SeriesExample {
	void series4() {
		int x=1;
		for(int i=1;i<=8;i++) 
		{
		System.out.println(x+" ");
			x=x*2;
			
			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SeriesExample obj= new SeriesExample();
		obj.series4();
	}

}
