package List;
import java.util.List;
import java.util.ArrayList;

public class List_Book 
{
	int id;
	String name,author,publisher;
	int quantity;
	public List_Book(int id,String name,String author, String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
	
}
class ListExampleBook
{
	public static void main(String[] args) 
	{
			List<List_Book> list=new ArrayList<List_Book>();
			
			List_Book b1=new List_Book(1,"let us c","yashwant","BPB",5);
			List_Book b2=new List_Book(2,"DC&N","frozon","McGrow Hills",2);
			List_Book b3=new List_Book(3,"Os","Galvin","Wille",1);
	
			list.add(b1);
			list.add(b2);
			list.add(b3);
			
			for(List_Book b:list)
			{
				System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			}
			
			
			
	}

}
