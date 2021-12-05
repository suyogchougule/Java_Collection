package LinkList_P;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList_Reverse_Element 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("suyog");
		ll.add("tushar");
		ll.add("aditya");
		
		Iterator<String> itr=ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
