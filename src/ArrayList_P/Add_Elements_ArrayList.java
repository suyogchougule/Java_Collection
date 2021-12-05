package ArrayList_P;
import java.util.ArrayList;


public class Add_Elements_ArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		System.out.println("Initial list of elements: "+al);  
		
		 //Adding elements to the end of the list  
		al.add("Suyog");
		al.add("Aditay");
		al.add("Shital");
		 System.out.println("After invoking add(E e) method: "+al);  
		 
		 al.add(1,"Tushar");
		 System.out.println("After invoking add(int index, E element) method: "+al);  
		 
		 
		 ArrayList<String> al2=new ArrayList<String>();
		 
		 al2.add("Sourabh");
		 al2.add("Abhishek");
		//Adding second list elements to the first list 
		 
		al.addAll(al2);
		 System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
		 
		 ArrayList<String> al3 =new ArrayList<String>();
		 
		 al3.add("Vijay");
		 al3.add("Ruturaj");
		 
		//Adding second list elements to the first list at specific position  
		 al.addAll(al3);
		 System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);
		 
		 }

}
