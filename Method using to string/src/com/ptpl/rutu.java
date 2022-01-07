package com.ptpl;

public class rutu {
	 String x;  
	 int y;  
	 float z;  
	  
	 rutu(String x, int y, float z){  
	 this.x=x;  
	 this.y=y;  
	 this.z=z;  
	 }  
	   
	 public String toString(){ 
	  return x+" "+y+" "+z;  
	 }  
	 public static void main(String args[]){  
		 rutu s1=new rutu("Monday",56,67);  
	     
	   System.out.println(s1);
	 } 
}
