package collection;
import java.util.ArrayList;
public class ListMethods {
	

	public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<>();
	a1.add(10);
	a1.add(91);
	a1.add(77);
	a1.add(10);
	a1.add(90);
	a1.add(35);
	a1.add(101);
	a1.add(93);
	a1.add(16);
	a1.add(10);
	a1.add(90);
	a1.add(76);
	System.out.println(a1);
	//for(Integer i:a1)
	//{
		//System.out.print(i+" ");
	//}
	a1.add(2,1000);
	System.out.println(a1);
	System.out.println(a1.contains(90));
	System.out.println("Indexof: "+a1.indexOf(10));
	System.out.println("LastIndexOf:"+a1.lastIndexOf(10));
	System.out.println(a1.isEmpty());
	//a1.clear();
	//System.out.println(a1);
	a1.remove(3);
	System.out.println(a1);
	System.out.println(a1.size());
	a1.set(1, 2500);
	System.out.println(a1);
	ArrayList<Integer> list1=new ArrayList<>();
	list1.add(70000);
	list1.add(80000);
	list1.add(90000);
	list1.add(10000);
	a1.addAll(list1);
	System.out.println(a1);
	System.out.println(a1.containsAll(list1));
	//a1.retainAll(list);
	//System.out.println(a1);
	//a1.removeAll(list1);
	System.out.println(a1);
	
	ArrayList<Integer> list2=new ArrayList<>();
	list2.add(70000);
	list2.add(80000);
	list2.add(90000);
	list2.add(10000);
	System.out.println(list1.equals(list2));
	
	}

}
