package string;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sbf= new StringBuffer("Core Java");
		System.out.println(sbf.capacity());
        sbf.append("Language");
        System.out.println(sbf);
        System.out.println("charAt: "+sbf.charAt(5));
        System.out.println("Indexof: "+sbf.indexOf("a"));
        System.out.println("LastIndexOf: "+sbf.lastIndexOf("g"));
        System.out.println(sbf.length());
        sbf.replace(5, 9, "JAVA");
        System.out.println(sbf);
        sbf.insert(4,"$");
        System.out.println(sbf);
       // sbf.reverse();
        // System.out.println(sbf);
        sbf.deleteCharAt(4);
        System.out.println(sbf);
        sbf.delete(4, 6);
        System.out.println(sbf);
        String s="Core Java";
        s.concat("Language");
        System.out.println(s);
        
	}

}
