package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class A
{
	void display() throws IOException
	{
		
	}
}

public class B extends A
{
	void display()
	{
		
	}
}

// no exception   ->   no exception/runtime exception
//runtime excetion - > no,same exception/diff rutime exception
//Compile time -->  no,runtime,same excetion, sub class of parent exception