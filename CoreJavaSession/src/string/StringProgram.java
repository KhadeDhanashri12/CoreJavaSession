package string;

public class StringProgram {

	void charCountWithoutMethod() {
		String s="Hello Welcome to Java Sessions";
		int cnt=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='e'||ch[i]=='E') {
				cnt++;
			}
		}
		System.out.println("cnt=> "+cnt);
	}
	void charCountWithoutMethods() {
		String s="Hello Welcome to Java Sessions";
		int cnt=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='s'||ch[i]=='s') {
				cnt++;
			}
		}
		System.out.println("cnt=> "+cnt);
	}
	public static void main(String[] args) {
		StringProgram obj=new StringProgram();
		obj.charCountWithoutMethod();
		obj.charCountWithoutMethods();

	}

}
