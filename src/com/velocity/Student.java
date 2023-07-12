package com.velocity;
import java.io.Serializable;
public class Student implements Serializable
{

	private static final long serialVersionUID = -7057634212504873530L;
   int rollno;
   String studentname;
   char division;


   
   public Student(int rollno,String studentname,char division)
   {
	   super();
	   this.rollno=rollno;
	   this.studentname=studentname;
	   this.division=division;
   }



@Override
public String toString() {
	return "Student [rollno=" + rollno + ", studentname=" + studentname + ", division=" + division + "]";
}
}
