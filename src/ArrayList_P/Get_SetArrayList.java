package ArrayList_P;
import java.util.ArrayList;
public class Get_SetArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Sourabh");
		list.add("namrata");
		list.add("Ankita");
		
		System.out.println("Returning elements:- "+list.get(1));
		
		list.set(1," Anuja");
		
		for(String name:list)
		{
			System.out.println(name);
		}
	}

}
