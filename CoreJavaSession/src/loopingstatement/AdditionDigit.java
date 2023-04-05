package loopingstatement;

public class AdditionDigit {

	public static void main(String[] args) {
		int num=5432,add=0;
		while(num!=0) 
		{			
			int r=num%10;
			add=add+r;
			num=num/10;
		}
System.out.println("Addition is: "+add);
	}

}
