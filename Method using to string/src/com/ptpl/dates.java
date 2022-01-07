package com.ptpl;

public class dates {
  int x;
  String y;
  int z;
    
  dates(int x, String y ,int z){
	  this.x=x;
	  this.y=y;
	  this.z=z;
  }
	  
	  public String toString() {
		 return x+ " "+y+ " "+z;
	  }
	  public static void main(String[] args) {
		   dates d=new dates(1,"piya",5);
		   
	  
	  System.out.println(d);
  }
}
   

