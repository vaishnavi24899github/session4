package com.overloading;

public class A {
     public void show(char ch)
     {
    	 System.out.println("the charcter is >>"+ch);
     }
     public void show(int a)
     {
    	 System.out.println("this is number  >>"+a);
     }
     public static void main(String[]args)
     {
    	 A a=new A();
    	 a.show('B');
    	 a.show(12);
    			 
     }
}
