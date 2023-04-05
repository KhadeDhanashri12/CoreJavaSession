package loopingstatement;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n=7;
		boolean prime=true;
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				prime= false;
				break;
			}
			i++;
		}
		System.out.println(prime);
	}

}
