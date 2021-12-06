package Vector;
import java.util.Vector;
public class Vector_Example2 
{

	public static void main(String[] args) 
	{
		Vector<String> vec=new Vector<String>(4);
		// Adding element to vector
		vec.add("Tushar");
		vec.add("Shital");
		vec.add("Vijay");
		vec.add("Ruturaj");
		
		//check size and capacity
		System.out.println("Size is "+vec.size());
		System.out.println("Default capacity is:"+vec.capacity());
		
		//Dispaly vector elements
		System.out.println("Vector element is"+vec);
		
		//Adding element using addElemnt() method of vector
		vec.addElement("Suyog");
		vec.addElement("Aditya");
		
		//again check size and capacity after two insertion
		System.out.println("Size affter addition:"+vec.size());
		System.out.println("Capacity after addition is:"+vec.capacity());
		
		// Dispaly Vector elements again
		System.out.println("Elements are:"+vec);
		// Cheking if Aditya is present or not in this vector
		if(vec.contains("Aditya"))
		{
			System.out.println("Aditya is present at the index="+vec.indexOf("Aditya"));
		}
		else
		{
			System.out.println("Tiger is not present in the list");
		}
		// get the first element
		System.out.println("The first Name of vector is="+vec.firstElement());
		
		// Get the last element 
		System.out.println("The Last Name of the Vector="+vec.lastElement());
		
		
		
		
		
	}

}
