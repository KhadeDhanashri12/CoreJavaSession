package arraysinjava;
import java.util.Arrays;

public class CaseChangeArray {

	void caseChange(char c[])// c=ch  address
	{
		System.out.println("Original array: "+Arrays.toString(c));
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A' && c[i]<='Z')
			{
				c[i]=(char) (c[i]+32);
			}
			else if(c[i]>='a' && c[i]<='z')
			{
				c[i]=(char) (c[i]-32);
			}
		}
		
		System.out.println("Changed array: "+Arrays.toString(c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch[]={'a','b','C','D','e','F','g','H','i','J'};
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		for(char c:ch)//c=ch[0]    c=ch[1]
		{
			System.out.print(c+" ");
		}
		
		/*CaseChangeArray obj= new CaseChangeArray();
		obj.caseChange(ch);
		
		System.out.println("---------------------------------------------\n");
		
		System.out.println(Arrays.toString(ch));*/

	}


}
