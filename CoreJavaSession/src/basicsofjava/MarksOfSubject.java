package basicsofjava;

public class MarksOfSubject {

	public static void main(String[] args) {
		 float total;
	     float average;
	     float percentage;
	     int english=60, chemistry=50, sciens=80, physics=70, maths=90; 
	     
	     total  = english + chemistry + sciens + physics + maths;
			average = total / 500;
		    percentage = (total / 500) * 100;
		    System.out.println("total of marks:"+total);
		    System.out.println("average of marks:"+average);
		    System.out.println("percentage of marks:"+percentage);
	     
	}

}
