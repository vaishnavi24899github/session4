package com.velocity;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Serializable
{
  public static void main(String args[])throws IOException
  {
	 
		Student student1=new Student(11, "Vaishanvi",'P'  );
	    Student student2=new Student(12, "Vishal",'Q' );
	    Student student3=new Student(13, "Yogesh", 'R' );
	    Student student4=new Student(14, "Vikas", 'S' );
	    Student student5=new Student(15, "Suraj", 'T' );
	    
	    FileOutputStream file=new FileOutputStream("C:\\Users\\HP\\Desktop\\Student.txt");
	    ObjectOutputStream objectoutputstream=new ObjectOutputStream(file);
	    objectoutputstream .writeObject(student1);
	      objectoutputstream .writeObject(student2);
	     objectoutputstream .writeObject(student3);
	     objectoutputstream .writeObject(student4);
	     objectoutputstream .writeObject(student5);
	    
	    objectoutputstream.flush();
	    objectoutputstream.close();
	    System.out.println("Serizalizable is successfully done!!!!");
	  }
  }
