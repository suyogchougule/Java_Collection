package ArrayList_P;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList_Iterator 
{

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("suyog");
		list.add("ketan");
		list.add("vijay");
		
		Iterator<String> itr=list.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
