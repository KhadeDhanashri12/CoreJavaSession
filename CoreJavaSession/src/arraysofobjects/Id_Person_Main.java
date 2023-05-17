package arraysofobjects;
import java.util.Arrays;
public class Id_Person_Main {
Person_Containment[] pc = new Person_Containment[6];
	
	void addData() {
		pc[0] = new Person_Containment(101,"Anuja",new IdProof_Continment(14526322,"AddharCard"));
		pc[1] = new Person_Containment(102,"Rohini",new IdProof_Continment(93664544,"PassPort"));
		pc[2] = new Person_Containment(103,"Aishwarya",new IdProof_Continment(12685555,"PassPort"));
		pc[3] = new Person_Containment(104,"Teju",new IdProof_Continment(78996555,"AddharCard"));
		pc[4] = new Person_Containment(105,"Komal",new IdProof_Continment(745855,"PanCard"));
		
	}
	void display() {
		System.out.println(Arrays.toString(pc));
		for(int i=0;i<pc.length;i++) {
			if(pc[i] != null) {
				if(pc[i].ip.name.equalsIgnoreCase("passport")) {
					System.out.println(pc[i]+" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Id_Person_Main obj = new Id_Person_Main();
		obj.addData();
		obj.display();
	}

}
