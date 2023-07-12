package com.practical.practice.deserilization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilize {

	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		
			
		FileInputStream file= new FileInputStream("C:\\Users\\HP\\Desktop\\Assignment8.txt");
		ObjectInputStream in=new ObjectInputStream(file);
		Object obj1=in.readObject();
		Object obj2=in.readObject();
		Object obj3=in.readObject();
		Object obj4=in.readObject();
		Object obj5=in.readObject();
		
		Students student1=(Students) obj1;
		Students student2=(Students) obj2;
		Students student3=(Students) obj3;
		Students student4=(Students) obj4;
		Students student5=(Students) obj5;
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		
		
		
		
	}
}
