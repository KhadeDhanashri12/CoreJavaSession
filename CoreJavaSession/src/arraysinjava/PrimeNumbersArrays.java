package arraysinjava;

public class PrimeNumbersArrays {
	void primeNumber(int a[])//a=ar
	{
		//{5,7,4,18,11,13,15,21,23,29,40}
		// i
		for(int i=0;i<a.length;i++) //4
		{
			int cnt=0;
			for(int j=1;j<=a[i];j++)//j=1 j=2      j=3    j=4 /2-6
			{
				if(a[i]%j==0)//4%1==0    4%2==0          4%4=0
				{
					cnt++;//cnt=3
				}
			}
			if(cnt==2)
			{
				System.out.println(a[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ar[]={5,7,4,18,11,13,15,21,23,29,40}; 
		
		PrimeNumbersArrays  obj=new PrimeNumbersArrays();
		
		obj.primeNumber(ar);

	}


}
