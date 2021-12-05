package LinkList_P;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkList_simple_p 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Tuhsar");
		ll.add("Suyog");
		ll.add("Abhi");
		ll.add("Aditya");
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
