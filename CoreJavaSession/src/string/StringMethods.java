package string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Language";
		String s3="java";
		String s4="Java";
		String s=new String("Java");
		
		System.out.println(s1==s);
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("equal: "+s1.equals(s3));
		System.out.println("equal ignore case:"+s1.equalsIgnoreCase(s3));
		System.out.println("Compareto: "+s1.compareTo(s3));
		
		String st1="Raj";
		String st2="Ramesh";
		
		System.out.println("Compareto st1,st2: "+st2.compareTo(st1));
		System.out.println("Compareto IgnoreCase: "+s1.compareToIgnoreCase(s3));
		
		System.out.println("Contains: "+s2.contains("a"));
		System.out.println("index of: "+s2.indexOf('g'));
		System.out.println("index of: "+s2.indexOf('a',3));
		System.out.println("lastIndex of: "+s2.lastIndexOf('g'));
		System.out.println("lastIndex of: "+s2.lastIndexOf('g', 6));
		System.out.println("Length: "+s3.length());
		System.out.println("CharAt: "+s2.charAt(4));
		System.out.println("replace: "+s2.replace('g', 'G'));
		System.out.println("ReplaceFirst:"+s2.replaceFirst("a", "A"));
		System.out.println("Uppercase: "+s2.toUpperCase());
		System.out.println("Lowercase: "+s2.toLowerCase());
		System.out.println("starts: "+s2.startsWith("A"));
		System.out.println("Ends: "+s2.endsWith("gs"));
		System.out.println(s2.isEmpty());
		
		char ch[]=s2.toCharArray();
		System.out.println(Arrays.toString(ch));
		String x="HelloWorld";
		String str[]=x.split("#");
		
		
	}
	

}
