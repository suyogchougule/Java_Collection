package List;
import java.util.Stack;
import java.util.Iterator;
import java.util.List;

public class Stack_P 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	 	Stack<String> S= new Stack<String>();
		S.push("Suyog");
		S.push("Sourabh");
		S.push("Tushar");
		Iterator<String> itr=S.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		 		
		/*---------------------------------------------*/
		
		List<String> LS=new Stack<String>();
		
		//LS.push("ketan");//The method push(String) is undefined for the type List<String>
		// cast the LS List into Stack
		
		((Stack<String>) LS).push("Aditya");
		((Stack<String>) LS).push("Shital");
		
		Iterator<String> itrL=LS.iterator();
		
		while(itrL.hasNext())
		{
			System.out.println(itrL.next());
		}
		
		
		
	}

}
