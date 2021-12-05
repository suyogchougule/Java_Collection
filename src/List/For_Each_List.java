//Iterating the List element using for-each loop
package List;
import java.util.List;
import java.util.ArrayList;
public class For_Each_List 
{

	public static void main(String[] args) 
	{
		List<String> L=new ArrayList<String>();
		L.add("Mango");
		L.add("Banana");
		L.add("Grapes");
		L.add("apple");
		
		for(String fruit:L)
		{
			System.out.println(fruit);
		}

	}

}
