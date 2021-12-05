package ArrayList_P;
import java.util.ArrayList;
public class ArrayList_remove_element 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("ravi");
		list.add("vijay");
		list.add("ajay");
		list.add("gourav");
		
		System.out.println("An initial list of element"+list);
		
		// removing specific emelment from arraylist
		
		list.remove("vijay");
		System.err.println("Affter invoking remove(object) method"+list);
		
		//
		list.remove(0);
		System.err.println("Affter invoking remove(index) method"+list);
		
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("suyog");
		al.add("tushar");
		
		list.addAll(al);
		System.err.println("updatelist:-"+list);
		
		list.removeAll(al);
		System.err.println("Affter invoking removeall()"+list);
		
		list.removeIf(str->str.contains("ajay")); //lambda expresion
		System.err.println("affter invoking removeif() method"+list);
		
		
		list.clear();
		System.err.println("affetr invoking clear() method"+list);
		
		
		
		
		

	}

}
