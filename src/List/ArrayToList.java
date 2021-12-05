/*We can convert the Array to List by traversing the array and adding the element in list one by one using list.add() method. 
 * Let's see a simple example to convert array elements into List.*/

package List;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToList 
{

	public static void main(String[] args) 
	{
		String[] array= {"Java","C++","c","python"};
		System.out.println("printing array:-"+Arrays.toString(array));
		
		
		List<String> LA=new ArrayList<String>();
		for(String a:array)
		{
			LA.add(a);
		}
		System.out.println("Printing List:-"+LA);
		
		
	}

}
