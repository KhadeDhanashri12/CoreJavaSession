package string;
import java.util.Arrays;
public class StringArray {
	static void wordCount()
	{
		String s="Java is a good programming language";
		
		String str[]=s.split(" ");
		
		System.out.println(Arrays.toString(str));
		
		System.out.println("total no of words: "+str.length);
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+"-> "+str[i].length());
		}
	}
	
	//display the string in reverse order of words  language programming good a is Java
	
	static void reverseOrder()
	{

		String s="Java is a good programming language";
		
		String str[]=s.split(" ");
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
		System.out.println();
	}
	
	static void oddIndexUpper()
	{//            1        3                  5
		// [Java, is, a, good, programming, language]
		
		String s="Java is a good programming language"; 
		String s1="";
		
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			if(i%2==1)
			{
				str[i]=str[i].toUpperCase();
				s1=s1+str[i]+" ";
			}
			else
				s1=s1+str[i]+" ";
		}
		
		System.out.println(s1);
		
	}
	
	static void sortString()
	{
		String s="Java is a good programming language";
		
		String str[]=s.split(" ");
		
		//// [Java, a, is, good, programming, language]  //Java a good is language programming
		
		System.out.println(Arrays.toString(str));
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length-1;j++)
			{
				int x=str[j].compareTo(str[j+1]);  //+ve 1>2
				//-ve 2>1
				//1=2
				
				if(x>0)
				{
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		wordCount();
		
		System.out.println("-------------------------------");
		reverseOrder();
		
		System.out.println("-------------------------------");
		oddIndexUpper();
		
		System.out.println("-------------------------------");
		sortString();

	}


}
