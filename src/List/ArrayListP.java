package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> AL= new ArrayList<String>();
		List<String> AL=new ArrayList<String>();
		AL.add("Suyog");
		AL.add("Aditya");
		AL.add("Shital");
		AL.add("Sourrabh");
		AL.add("Abhishek");
		
		Iterator<String> itr=AL.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
