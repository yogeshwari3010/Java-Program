package com.ptpl;
//this code that prints reference.
public class Colour {
	int rollno;  
	 String name;  
	 String city;  
	  
	 Colour(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
	   Colour s1=new Colour(101,"Raj","lucknow");  
	   Colour s2=new Colour(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
}
