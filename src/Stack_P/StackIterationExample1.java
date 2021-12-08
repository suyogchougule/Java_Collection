package Stack_P;
import java.util.Stack;
import java.util.Iterator;
public class StackIterationExample1 
{

	public static void main(String[] args) 
	{
		Stack<String> stk = new Stack<>();  
		//pushing elements into stack  
		stk.push("BMW");  
		stk.push("Audi");  
		stk.push("Ferrari");  
		stk.push("Bugatti");  
		stk.push("Jaguar");  
		//iteration over the stack  
		Iterator<String> itr = stk.iterator();  
		while(itr.hasNext())  
		{  
		Object values = itr.next();  
		System.out.println(values);   
		}
	}

}
