package string;
import java.util.Arrays;

public class CharNumberCount {
	void charNumber()
	{
		String s="d6Ndn8mCb9dh4dJh3bxv2";
		
		char ch[]=s.toCharArray();
		
		int ccnt=0,ncnt=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>'a' && ch[i]<='z')
			{
				ccnt++;
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ccnt++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				ncnt++;
			}
			
		}
		
		System.out.println("Character cnt: "+ccnt);
		System.out.println("Number cnt: "+ncnt);
	}
	
	
	void caseChange()
	{
		String s="aBcDeFgHiJKl";
		System.out.println(s);
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]= (char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		String s1= new String(ch);
		System.out.println(s1);
	}
	
	void frequencyOfCharacter()
	{
		String s="Java is a good programming language";
		                
		char ch[]=s.toCharArray();
		//System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
					if(ch[i]==ch[j])
					{
						cnt++;
						ch[j]='\0';
					}
				
			}
			if(ch[i]!='\0' && ch[i]!=' ')
				System.out.println(ch[i]+" => "+cnt);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharNumberCount obj= new CharNumberCount();
		
		obj.charNumber();
		System.out.println("-----------------------------------");
		obj.caseChange();
		System.out.println("-----------------------------------");
		
		obj.frequencyOfCharacter();

	}

}
