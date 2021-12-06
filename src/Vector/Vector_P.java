package Vector;
import java.util.Vector;
public class Vector_P {

	public static void main(String[] args) 
	{
		Vector<String> vec= new Vector<String>();
		// Adding element ussing add() method of List
		vec.add("Suyog");
		vec.add("Aditya");
		vec.add("Tushar");
		// Adding element using addElement() method of vector
		vec.addElement("Shital");
		vec.addElement("Sourabh");
		vec.addElement("Abhishek");
		
		System.out.println("Element are:"+vec);
	}

}
