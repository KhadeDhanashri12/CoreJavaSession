package arraysinjava;
import java.util.Arrays;
public class ReverseArray {
	static void reverse(int arr[])
	{
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.println(arr[i]);
//		}
		
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
	int arr[]= {3,6,7,10,8,9};
	
	reverse(arr);

	}

}
