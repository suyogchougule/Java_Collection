package List;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class List_Iterator 
{

	public static void main(String[] args) 
	{
			List<String> la=new ArrayList<String>();
			la.add("Suyog");
			la.add("Sourabh");
			la.add("Tushar");
			la.add(1,"Aditya");
			
			ListIterator<String> itr=la.listIterator();
			
			System.out.println("Traverse element in Forword Direction.");
			while(itr.hasNext())
			{
				System.out.println("Index:"+itr.nextIndex()+" Values :"+itr.next());
			}
			
			System.out.println("Traverse elemnt in backward Direction.");
			while(itr.hasPrevious())
			{
				System.out.println("Index: "+itr.previousIndex()+" Values: "+itr.previous());
			}
			
		}

}
