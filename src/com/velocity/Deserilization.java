package com.velocity;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class Deserilization 
{
    public static void main(String []args)throws IOException, ClassNotFoundException
    {
    		FileInputStream file= new FileInputStream("C:\\Users\\HP\\Desktop\\student_recoed.txt");
			ObjectInputStream in=new ObjectInputStream(file);
    		Object obj1=in.readObject();
    		Object obj2=in.readObject();
    		Object obj3=in.readObject();
    		Object obj4=in.readObject();
    		Object obj5=in.readObject();
    		
    		
    		Student student1=(Student) obj1;
    		Student student2=(Student) obj2;
    		Student student3=(Student) obj3;
    		Student student4=(Student) obj4;
    		Student student5=(Student) obj5;
    		
    		System.out.println(student1);
    		System.out.println(student2);
    		System.out.println(student3);
    		System.out.println(student4);
    		System.out.println(student5);
    		
    		
    	}
}
