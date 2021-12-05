package ArrayList_P;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;
public class Multipal_Iterator 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("suyog");
		list.add("Aditya");
		list.add("Tushar");
		list.add("Shital");
		
		System.out.println("Traversing list through List Iterator:");  
		ListIterator<String> ltr=list.listIterator(list.size());
		
		  while(ltr.hasPrevious())  
		{
			  String str=ltr.previous();
			  System.out.println(str);
		}
		  
		  System.out.println("Traversing list through for loop:");  
		  for(int i=0;i<list.size();i++)
		  {
			  System.out.println(list.get(i));
		  }
		  
		  System.out.println("Traversing list through forEach() method:"); 
		  	
		  list.forEach(a->{
			
			  System.out.println(a);
		  });
		  
		  System.out.println("Traversing list through forEachRemaining() method:");  
		  Iterator<String> itr=list.iterator();
		  
		  itr.forEachRemaining(a->{
			  System.out.println(a);
		  });
			 
		  
	}

}
