package ArrayList_P;
import java.util.ArrayList;
public class ArrayList_For_each 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("tushar");
		list.add("aditya");
		list.add("shital");
		
		for(String name:list)
		{
			System.out.println(name);
		}
	}

}
