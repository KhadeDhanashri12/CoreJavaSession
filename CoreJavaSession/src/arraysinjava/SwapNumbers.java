package arraysinjava;
import java.util.Arrays;

public class SwapNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //        i
		int a[]={1,2,3,4,5,6,7,8};
		//       0 1 2 3 4 5 6 7
		int mid=a.length/2; //4
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<mid;i++) //i=0          i=1
		{
			int temp=a[i];//temp=1            temp=2
			a[i]=a[mid+i]; //a[0]=a[4]=5     a[1]=a[5]=6
			a[mid+i]=temp;//a[4]=1           a[5]=temp=2
		}

		System.out.println(Arrays.toString(a));
		
	}



}
