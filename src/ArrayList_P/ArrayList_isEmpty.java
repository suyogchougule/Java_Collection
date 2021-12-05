package ArrayList_P;
import java.util.ArrayList;
public class ArrayList_isEmpty 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();  
        System.out.println("Is ArrayList Empty: "+al.isEmpty());  
        al.add("Ravi");    
        al.add("Vijay");    
        al.add("Ajay");    
        System.out.println("After Insertion"+al);  
        System.out.println("Is ArrayList Empty: "+al.isEmpty());

	}

}
