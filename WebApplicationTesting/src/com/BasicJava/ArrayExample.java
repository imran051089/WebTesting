package com.BasicJava;

public class ArrayExample {

	public static void main(String[] args)
	{
		/*int a=20;
		a=30;
		System.out.println(a);*/
		
		int []a= new int[3];
		
		a[0]=20;
		a[1]=30;
		a[2]=40;
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		

	}

}
