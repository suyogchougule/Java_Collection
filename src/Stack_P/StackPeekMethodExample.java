package Stack_P;
import java.util.Stack;
public class StackPeekMethodExample 
{

	public static void main(String[] args) 
	{
		Stack<String> stk=new Stack<>();
		stk.push("Suyog");
		stk.push("Aditya");
		stk.push("Tushar");
		stk.push("Shital");
		System.out.println("Stack:"+stk);
		//Access element from the top of the stack
		String names=stk.peek();
		//print stack
		System.out.println("Element at top:-"+names);
	}

}
