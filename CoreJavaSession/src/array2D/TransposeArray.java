package array2D;
import java.util.Scanner;
public class TransposeArray {
	int arr[][]=new int[2][3];
	void addData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	void display()
	{
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				 System.out.println(arr[i][j]+" ");
			}
			System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
