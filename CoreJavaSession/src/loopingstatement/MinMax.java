package loopingstatement;

public class MinMax {

	public static void main(String[] args) {
		int num=15432; 
		int min=0,max=0;
		while(num!=0)
		{
			int r=num%10;
			if(r>max)
			{
				if(r>min)
				{
					min=r;
				}
				num=num/10;
			}
			System.out.println("max digit: "+max);
			System.out.println("min digit: "+min);
		}
	}

}
