package arraysinjava;
import java.util.Scanner;
public class Program1 {
	static void print(int arr[])
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//System.out.println(i);
	}

	public static void main(String[] args) {
		
		
		//int arr[]= {4,6,7,8,13};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		print(arr);
		System.out.println("hello");
		

	}


}
