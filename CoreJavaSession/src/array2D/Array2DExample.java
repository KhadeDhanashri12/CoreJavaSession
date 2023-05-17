package array2D;
import java.util.Scanner;

public class Array2DExample {
int arr[][]= new int[3][3];
	
	void addData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt(); //arr[0][0]
			}
		}
	}
	
	
	void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	
	void additionDiagonalElements()
	{
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				}
				
			}
			
		}
		System.out.println("Addition is: "+sum);
	}
	
	void addEachRow()
	{
		
		for(int i=0;i<3;i++)
		{	
			int sum=0;
			for(int j=0;j<3;j++)
			{
				sum=sum+arr[i][j];
			}
			System.out.println("Sum of "+(i+1)+" row: "+sum);
		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//arr[0][0]=10
		//arr[0][1]=20
		
		Array2DExample obj= new Array2DExample();
		
		obj.addData();
		obj.display();
		System.out.println("-----------------------------------\n");
		obj.additionDiagonalElements();
		
		System.out.println("-----------------------------------\n");
		obj.addEachRow();
		
		//literals
		
		/*int arr1[][]={{1,2,3},{4,5,6}};
		
		char ch[][]={{'a','b'},{'c','d'},{'e','f'},{'g','h'}};
		
		//1 2 3
		//4 5 6
		
		//a b
		//c d
		//e f
		//g h
		 * 
		 * Sum of 1 row: 6
			Sum of 2 row: 15
			Sum of 3 row: 24
*/		

	}


}
