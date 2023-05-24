package Exception;

public class SingleTryMultipleCatch {

	public static void main(String[] args) {
		int a=10,b=0;
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		String s=null;
		try 
		{
			System.out.println(arr[6]);
			System.out.println(a/b);
			System.out.println(s.length());
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			e.printStackTrace();
			
		}
		catch(Exception e)
		{

			e.printStackTrace();
		}
		
		System.out.println("Done............!!!!");

	}

}
