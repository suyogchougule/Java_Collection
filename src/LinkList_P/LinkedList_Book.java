package LinkList_P;
import java.util.LinkedList;
import java.util.List;
class Book
{
	int id;
	String name,author,publishar;
	int quantity;
	
	public Book(int id,String name,String author,String Publishar,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publishar=Publishar;
		this.quantity=quantity;
		
	}
}
public class LinkedList_Book 
{

	public static void main(String[] args) 
	{
		List<Book> ll=new LinkedList<Book>();
		
		Book b1= new Book(1,"c","Yashwant","BPB",10);
		Book b2= new Book(2,"c","Yashwant","BPB",10);
		Book b3= new Book(3,"c","Yashwant","BPB",10);

		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		
		for(Book B:ll)
		{
			System.out.println(B.id+" "+B.name+" "+B.author+" "+B.publishar+" "+B.quantity);
		}
	}

}
