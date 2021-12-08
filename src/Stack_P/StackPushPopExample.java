package Stack_P;
import java.util.EmptyStackException;
import java.util.Stack;
public class StackPushPopExample 
{
	static void pushelmnt(Stack<Integer> stk,int x)
	{
		stk.push(new Integer(x));
		System.out.println("Push->"+x);
		// print modified stack
		System.out.println("Stack:"+stk);
		
	}
	static void popelmnt(Stack<Integer> stk)
	{
		System.out.println("POP->");
		//invoking pop() method
		Integer x=(Integer) stk.pop();
		System.out.println(x);
		// print modified stack
		System.out.println("Stack: "+stk);
	}

	public static void main(String[] args) 
	{
		Stack<Integer> stk = new Stack<>();
		System.out.println("Stack: +stk");
		pushelmnt(stk, 20);
		pushelmnt(stk, 13);
		pushelmnt(stk, 89);
		pushelmnt(stk, 90);  
		pushelmnt(stk, 11);  
		pushelmnt(stk, 45);  
		pushelmnt(stk, 18); 
		//popping elemeents from the stack
		popelmnt(stk);
		popelmnt(stk);
		// throw exception if the stack is emplty
		try
		{
			popelmnt(stk);
			
		}
		catch(EmptyStackException e)
		{
			System.out.println("empty stack");
		}
		
	}

}
