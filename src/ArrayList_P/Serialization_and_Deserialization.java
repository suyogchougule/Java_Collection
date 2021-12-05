package ArrayList_P;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
import java.io.*;
import java.util.ArrayList;

public class Serialization_and_Deserialization 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("Suyog");
		al.add("Aditay");
		al.add("Tushar");
		al.add("Shital");
		
		try
		{
			// Serialization
				FileOutputStream fos= new FileOutputStream("file");
				ObjectOutputStream oos= new ObjectOutputStream(fos);
				
				oos.writeObject(al);
				fos.close();
				oos.close();
				
			// DeSerialization
				FileInputStream fis= new FileInputStream("file");
				ObjectInputStream ois=new ObjectInputStream(fis);
				
				ArrayList list= (ArrayList) ois.readObject();
				
				System.out.println(list);
				
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
