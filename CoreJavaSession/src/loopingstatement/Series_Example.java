package loopingstatement;

public class Series_Example {
	void series1()
	{
		 //1 4 7 10 13 16 19 22
		//int i=1;
		/*for(int i=1;i<=22;i+=3)    // i=1  i=4   i=7  i=10  i=13  i=16  i=19   i=22
		{
			System.out.print(i+" ");//1   4 7  10  13  16 19 22
			//i=i+3;
		}*/
		
		int x=1;
		for(int i=1;i<=8;i++)
		{
			System.out.print(x+" ");
			x=x+3;
		}
		
	}
	
	
	void squareSeries()
	{
		//1 4 9 16 25 36
		for(int i=1;i<=6;i++)
		{
			System.out.print((i*i)+" ");
		}
	}

	
	void series2()
	{
		//1 2 6 15 31 56
		// 1 2 3  4  5
		int x=1;
		for(int i=1;i<=56;)     //   i=1             i=2            i=6             i=15               i=31          i=56           i=92
		{
			System.out.print(i+" ");// 1              2              6               15                 31            56
			
			i=i+(x*x);//            i=1+(1*1)=2    i=2+(2*2)=6   i=6+(3*3)=15    i=15+(4*4)=31      i=31+(5*5)=56  i=56+(6*6)=92
			
			x++;//                  x=2             x=3            x=4             x=5                  x=6          x=7
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Series_Example obj= new Series_Example();
		obj.series1();
		System.out.println("\n-----------------------");
		
		obj.squareSeries();
		System.out.println("\n-----------------------");
		
		
		obj.series2();

	}

}


