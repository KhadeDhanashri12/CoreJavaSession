package loopingstatement;

public class MinMax {

	public static void main(String[] args) {
		int num=15432,max=num%10,min=num%10;
		
		while(num!=0)
		{
			int r=num%10;
			if(r>max)
			{
				max=r;
			}
				if(r<min)
				{
					min=r;
				}
				num=num/10;
			}
			System.out.println("max digit: "+max);
			System.out.println("min digit: "+min);
		}
	}


