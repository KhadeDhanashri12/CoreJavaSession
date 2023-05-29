package class_object_InstanceVariable;

//Sample code for encapsulation concept
public class Prog_4 {
	
	// Encapsulation refers to the bundling of fields and methods inside a single class.
	
	private int eid;
	private String empName;
	
	// getters and setters

	public int getEid() {     // method to access id outside the class  
		return eid;
	}

	public void setEid(int eid) { // method to set id from outside the class
		this.eid = eid;
	}

	public String getEmpName() {  // method to access empName outside the class
		return empName;
	}

	public void setEmpName(String empName) { // method to set id from outside the class
		this.empName = empName;
	}
}

