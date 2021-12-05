package List;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Sort_List 
{

	

	public static void main(String[] args) 
	{
			List<String> list=new ArrayList<String>();
			list.add("Suyog");
			list.add("Tushar");
			list.add("Aditya");
			list.add("Ruturaj");
			
			Collections.sort(list);
			System.out.println("Array sort.");
			for(String names:list)
			{
				System.out.println(names);
			}
			
			System.out.println("Integer number sort.");
			
			List<Integer> i= new ArrayList<Integer>();
			i.add(5);
			i.add(6);
			i.add(4);
			i.add(1);
			i.add(2);
			i.add(3);
			Collections.sort(i);
			
			
			Iterator<Integer> itr=i.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
	}

}
