package LinkList_P;
import java.util.LinkedList;
public class LinkList_add_elements 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Aditya");
		ll.add("Suyog");
		ll.add("sourabh");
		ll.add("tushar");
		System.out.println("Affter invoking add(E e) element");
		
		// adding element at specific position
		ll.add(1,"Shital");
		System.out.println("Affter add(int index ,E element)"+ll);
		
		LinkedList<String> ll2= new LinkedList<String>();
		ll2.add("Abhishek");
		ll2.add("vaibhave");
		
		//adding second list of element into first element list
		
		ll.addAll(ll2);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method:"+ll);
		
		LinkedList<String> ll3=new LinkedList<String>();
		
		ll3.add("Vinayk");
		ll3.add("Vishal");
		//Adding second list elements to the first list at specific position
		ll.addAll(1,ll3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method:"+ll);
		
		//Adding an element at the first position  
		ll.addFirst("Amol");
		System.out.println("After invoking addFirst(E e) method:"+ll);
		
		//Adding an element at the Last position
		ll.addLast("Akshay");
		System.out.println("After invoking addLast(E e) method:"+ll);
		}

}
