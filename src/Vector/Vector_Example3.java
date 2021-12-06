package Vector;
import java.util.Vector;
public class Vector_Example3 
{

	public static void main(String[] args) 
	{
		Vector<Integer> in=new Vector<Integer>();
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(200);
		in.add(400);
		in.add(600);
		in.add(700);
		
		//Dispaly the vector elements
		System.out.println("Values in vector:"+in);
		// use remove() method to delete the first occurence of an element
		System.err.println("Remove first occourence of element 200:"+in.remove((Integer)200));
		
		// Remove the element at index 4
		System.err.println("Remove element at index 4: "+in.remove(4));
		System.err.println("New Value list in vector: "+in);
		// Remove an element
		
		in.removeElementAt(3);
		// Cheking Vector aand Dispaly the element
		System.out.println("Vector element after remove: "+in);
		
		//get the hashcode for this vector
		System.err.println("Hash code of this vector="+in.hashCode());
		
		//get the elemet at specified index
		System.out.println("Element at index 1 is="+in.get(1));
		

	}

}
