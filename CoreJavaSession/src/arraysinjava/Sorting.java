package arraysinjava;
import java.util.Arrays;
public class Sorting {
	static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Fourth Maximum");
		System.out.println(arr[arr.length-4]);
		System.out.println("second minimum");
		System.out.println(arr[1]);
	}

	public static void main(String[] args) {
		int arr[]= {11,6,7,4,2};
		sort(arr);

	}



}
