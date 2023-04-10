package loopingstatement;

public class SeriesExample1 {



	/*
	 * 1 4 7 10 13 16 19 21
	  3 3  3  3  3


	1 4 9 16 25 36 
	1 2 3 4  5    6


	1 2 4 8 16 32 64


	1 2 6 15 31 56
	  1 4  9  16 25
	  
	 */

		
		
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
			//1 2 4 8 16 32 64
			int x=1;
			for(int i=1;i<=64;)
			{
				System.out.print(i+" ");
				i=i+(x*x);
				x++;
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			SeriesExample1 obj= new SeriesExample1();
			obj.series1();
			System.out.println("\n-----------------------");
			
			obj.squareSeries();
			System.out.println("\n-----------------------");
			
			
			obj.series2();

		}
		

	}

