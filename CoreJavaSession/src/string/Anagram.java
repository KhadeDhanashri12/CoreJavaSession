package string;
import java.util.Arrays;
public class Anagram {
	void sanagram(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			
			//Arrays.sort(c1);
			Arrays.sort(c2);
			// j
			//[e, e, K, p]
			
			//[e, K, e, p]
			
			// [K, e, e, p]
			
			//[K, e, e, p]
			
			for(int i=0;i<c1.length;i++)
			{
				for(int j=0;j<c1.length-1;j++)
				{
					if(c1[j]>c1[j+1])
					{
						char temp=c1[j];
						c1[j]=c1[j+1];
						c1[j+1]=temp;
					}
				}
			}
			
			System.out.println(Arrays.toString(c1)); //utility class
			System.out.println(Arrays.toString(c2));
			
			int cnt=0;
			
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]==c2[i])
				{
					cnt++;
				}
			}
			
			if(cnt==c1.length)
				System.out.println("Anagram");
			else
				System.out.println("not anagram");
		}
		else
			System.out.println("not anagram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "peaK";
		String s2= "Keep";
		
		Anagram obj= new Anagram();
		
		obj.sanagram(s1, s2);

	}

}
