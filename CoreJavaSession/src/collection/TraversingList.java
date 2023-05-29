package collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class TraversingList {

	public static void main(String[] args) {
		ArrayList<Character> ch=new ArrayList<>();
		ch.add('a');
		ch.add('t');
		ch.add('d');
		ch.add('i');
		ch.add('a');
		ch.add('b');
		ch.add('c');
		ch.add('i');
		ch.add('d');
		ch.add('e');
		ch.add('f');
		ch.add('i');
		ch.add('a');
		ch.add('u');
		ch.add('d');
		ch.add('i');
		ArrayList<Character> ch1=new ArrayList<>();
		System.out.println(ch1);
		
		
		ListIterator<Character> litr=ch.listIterator();
		while(litr.hasNext()) 
		{
			System.out.println(litr.next()+" ");
			/* litr.hasNext()
			litr.hasPrevious()
			litr.next()
			litr.previous()
			litr.nextIndex()
			listitr.add(e);
			listitr.remove();
			listitr.set(e); */
		}
		System.out.println("\n.................................");
		System.out.println("ListIterator for lists only backward direction...!!!");
		ListIterator<Character> listlitr=ch.listIterator();
		while(litr.hasNext()) 
		{
			System.out.println(litr.next()+" ");

	}

}
