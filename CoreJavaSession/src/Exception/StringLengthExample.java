package Exception;

public class StringLengthExample {
	int getStringLength(String s) throws NullPointerException
	{
		if(s==null)
		{
			throw new NullPointerException("String cannot be null...please enter a valid string");
			
		}
		return s.length();
	}

	public static void main(String[] args) {
		StringLengthExample obj=new StringLengthExample();
		System.out.println(obj.getStringLength("India"));
		System.out.println(obj.getStringLength(null));
		System.out.println(obj.getStringLength("Language"));
		System.out.println(obj.getStringLength("core java"));


	}

}
