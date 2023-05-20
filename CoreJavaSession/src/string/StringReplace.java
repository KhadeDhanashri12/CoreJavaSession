package string;

import java.util.Arrays;

public class StringReplace {
	static  void replace() {
  	  String s = "Core java  Advance java Core java is good java is easy ";
  	   String str[] = s.split(" ");
  	   String s1 =" ";
  	   for(int i=0;i<str.length;i++) {
  		   if(str[i].equalsIgnoreCase("java")) {
  			   str[i] = "JAVA";
  			   
  		   }
  		   s1 = s1+str[i]+" ";
  	   }
  	  System.out.println("New String is : "+s1);
    }

	public static void main(String[] args) {
		replace();

	}

}
