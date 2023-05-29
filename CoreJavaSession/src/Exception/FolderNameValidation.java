package Exception;

public class FolderNameValidation {
void validate(String s) throws FolderNameException
{
	if(s.contains(" "))
	{
		throw new FolderNameException("Folder name cannot have a space...!");
	}
	else
		System.out.println("valid name");
}
	public static void main(String[] args) {
		String s="JavaPractical";
		FolderNameValidation obj=new FolderNameValidation();
		try {
			obj.validate(s);
		}
		catch(FolderNameException e)
		{
			e.printStackTrace();
		}

	}

}
