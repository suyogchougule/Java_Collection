package List;
import java.util.Vector;
import java.util.Iterator;
import java.util.List;
public class Vector_p 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Vector<String> V=new Vector<String>();
		//OR
		List<String> V=new Vector<String>();
		
		V.add("Suyog");
		V.add("Aditya");
		V.add("Sourabh");
		V.add("Tushar");
		
		Iterator<String> itr=V.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
