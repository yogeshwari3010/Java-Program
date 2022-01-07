package com.ptpl;

public class Colour1 {
	 String x;  
	 String y;  
	 String z;  
	  
	 Colour1(String x, String y, String z){  
	 this.x=x;  
	 this.y=y;  
	 this.z=z;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return x+" "+y+" "+z;  
	 }  
	 public static void main(String args[]){  
		 Colour1 s1=new Colour1("pink","\nblue","\nyellow");  
		 Colour1 s2=new Colour1("\n\nblack","\nwhite","\nred");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 } 
}
