package containment;

public class Student {
	String name;
	int marks;
	String subject;
	Course c;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", subject=" + subject + ", c=" + c + "]";
	}
	
	
}
