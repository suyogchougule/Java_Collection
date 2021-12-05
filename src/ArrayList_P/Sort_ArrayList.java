package ArrayList_P;
import java.util.ArrayList;
import java.util.Collections;
public class Sort_ArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list =new ArrayList<String>();
		
		list.add("namrata");
		list.add("Ankita");
		list.add("Snehal");
		list.add("Rachana");
		
		Collections.sort(list);
		
		for(String name:list)
		{
			System.out.println(name);
		}
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(5);
		list1.add(3);
		list1.add(1);
		list1.add(2);
		
		Collections.sort(list1);
		
		for(Integer num:list1)
		{
			System.out.println(num);
		}
	}

}
