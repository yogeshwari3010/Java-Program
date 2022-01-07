package com.ptpl;

public class Room {
    String a;
    String b;
      
    
    Room(String a, String b){
    	this.a=a;
    	this.b=b;
    	
    }
    
    public String toString() {
    	return a+ " "+b;
    }
    public static void main(String[] args) {
     Room R=new Room("Raja", "Rani");
     Room R1=new Room("Piya", "Rutu");
     
     System.out.print(R);
     System.out.print(R1);
	}

}
