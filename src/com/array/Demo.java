package com.array;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 

	{
		int[]x=new int[7];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<x.length-1;i++)
		{
			System.out.println("Enter the no");
			
			int value=sc.nextInt();
			x[i]=value;
		}
		for(int z :x)
		{
			
			System.out.println(z);
		}
		

	}

}
