package List;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ListToArray 
{

	public static void main(String[] args) 
	{
		List<String> LA=new ArrayList<>();
		LA.add("Apple");
		LA.add("Banana");
		LA.add("Mango");
		LA.add("grapes");
		
		System.out.println("Printing List"+LA);
		
		//---------Array-------------
		
		String [] array=LA.toArray(new String[LA.size()]);
		System.out.println("Printing array:-"+Arrays.toString(array));
		
	
	}

}
