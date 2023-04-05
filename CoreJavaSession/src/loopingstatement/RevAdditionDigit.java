package loopingstatement;

public class RevAdditionDigit {

	public static void main(String[] args) {
		int num=1234,add=0,reversed=0;
		while(num!=0) 
		{			
			int remainder=num%10;
			reversed= reversed * 10+ remainder;
			add=add+remainder;
			num=num/10;
		}
		
System.out.println("Reversed is: "+reversed);
		
System.out.println("Addition is: "+add);

	}

}
