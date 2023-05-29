package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOperations {
FileInputStream fis=null;
	
	void connectFile() throws FileNotFoundException,NullPointerException
	{
		fis= new FileInputStream("D://Test//Test1.txt"); //read() ==>ascii value of character
	}
	
	void readData()
	{
		try {
			//fis= new FileInputStream("D://Test//Test1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //read() ==>ascii value of character
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	
	public static void main(String[] args)   {
		
		FileOperations obj= new FileOperations();
		
		//obj.connectFile();
		
		obj.readData();
		obj.add(100, 300);
		
		
		System.out.println("Done....!!!");
		

		
	}

}
