package com.ptpl;

public class Days {
	 String x;  
	 String y;  
	 String z;  
	  
	 Days(String x, String y, String z){  
	 this.x=x;  
	 this.y=y;  
	 this.z=z;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return x+" "+y+" "+z;  
	 }  
	 public static void main(String args[]){  
		 Days s1=new Days("Monday","\nTuesday","\nWensday");  
		 Days s2=new Days("\n\nThursday","\nFriday","\nSaturday");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 } 
}
