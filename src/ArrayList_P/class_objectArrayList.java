package ArrayList_P;
import java.util.*;

class Student
{
	int Rollnum;
	String name;
	int age;
	Student(int Rollnum,String name,int age)
	{
		this.Rollnum=Rollnum;
		this.name=name;
		this.age=age;
	}
}


public class class_objectArrayList 
{
	public static void main(String[] args)
	{
		Student s1=new Student(1,"suyog",25);
		Student s2=new Student(2,"Nitin",28);
		Student s3=new Student(3,"Vijay",22);
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator<Student> itr=al.iterator();
		
		
		while(itr.hasNext()) 
		{
			Student st=(Student)itr.next();
			
			System.out.println(st.Rollnum+" "+st.name+" "+st.age);
		}
		
	}
	
	
}
