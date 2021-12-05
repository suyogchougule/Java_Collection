package List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List; // upcasting list->LinkedList
public class LinkedList_P 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//LinkedList<String> LL=new LinkedList<String>();
		//or
		List<String> LL=new LinkedList<String>();
		
		LL.add("Suyog");
		LL.add("Aditya");
		LL.add("Sourabh");
		LL.add("Tushar");
		LL.add("Shital");
		LL.add("Abhishek");
		
		Iterator<String> itr=LL.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
