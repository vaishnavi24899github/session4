package com.overloading;

public class A1 
{
	//number of parameter
     public void show(char ch)
     {
    	 System.out.println("the charcher is>>"+ch);
     }
     public void show(int a,char ch)
     {
    	 System.out.println("the conatin number>>"+a+","+"charcter is>>"+ch);
     }
     public static void main(String[]args)
     {
    	 A1 a =new A1();
    	 a.show('C');
    	 a.show(12,'B');
     }
}
