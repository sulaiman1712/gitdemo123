package com.Saturday01.practice;

public class inheritance01 
{
	private void student_information(String name,int id,char x)
	{
		System.out.println("Student name:"+ name);
		System.out.println("Student RollNo.:"+ id);
	    System.out.println("Student intial:"+ x);
	}
	private void student_information(long age,String f,char y)
	{
		System.out.println("Student Age:"+ age);
		System.out.println("Fathername:"+ f);
		System.out.println("Fatherinitial:"+ y);
		
	}
	public void student_information(String m,char k)
	{
		System.out.println("Mothername:"+m);
		System.out.println("Mothername initial:"+k);
	}
	
	public static void main(String[] args) 
	{
		
		inheritance01 stu=new inheritance01();
		
		stu.student_information( "ram",4566,  'k');
		stu.student_information(24l, "Kumaran",'l');
		stu.student_information("Lakshmi", 'p');
	
		
	}

}
