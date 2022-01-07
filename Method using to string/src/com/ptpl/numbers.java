package com.ptpl;

public class numbers {
	int x;  
	 String y;  
	 int z;  
	  
    numbers(int x, String y, int z){  
	 this.x=x;  
	 this.y=y;  
	 this.z=z;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return x+" "+y+" "+z;  
	 }  
	 public static void main(String args[]){  
		 numbers s1=new numbers(10,"20",30);  
		 numbers s2=new numbers(40,"50",60);  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 } 
}
