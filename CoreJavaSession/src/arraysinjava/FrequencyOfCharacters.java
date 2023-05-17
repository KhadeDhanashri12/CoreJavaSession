package arraysinjava;
import java.util.Arrays;

public class FrequencyOfCharacters {
	void frequency(char c[]) //c=ch
	{
		//{'a','b','c','d','\0','\0','c','d','\0','b','d','\0','\0'};
		//      i                j
		for(int i=0;i<c.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j] )
				{
					cnt++;//cnt=2
					c[j]='\0';
				}
			}
			if(c[i]!='\0')
				System.out.println(c[i]+" => "+cnt);
		}
		
	}
	
	void frequencyUsingArray(char c[])
	{
		boolean br[]= new boolean[c.length];
		Arrays.fill(br, true);
		//System.out.println(Arrays.toString(br));
		
		for(int i=0;i<c.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					cnt++;
					br[j]=false;
				}
			}
			
			if(br[i]==true)
				System.out.println(c[i]+" => "+cnt);
		}
		/*System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(br));*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch[]={'a','b','c','d','a','b','c','d','a','b','d','a','a'};
		
		FrequencyOfCharacters obj= new FrequencyOfCharacters();
		
	//	obj.frequency(ch);
		
		System.out.println("---------------------------------\n");
		obj.frequencyUsingArray(ch);

	}


}
