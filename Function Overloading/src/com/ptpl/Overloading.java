package com.ptpl;

public class Overloading {
    void Volume(int r, int h ) {
    	double Volume = 3.14*r*2*h;
    	System.out.println("Volume of a circle :- "+Volume);
    }
    void Volume(int a ) {
    	double Volume = a*a*a;
    	System.out.println("Volume of a cube :- "+Volume);
    }
    void Volume(int l, int w, int h ) {
    	double Volume = l*w*h;
    	System.out.println("Volume of a circle :- "+Volume);
    }

    

public static void main(String[] args) {
   Overloading O=new Overloading();
   O.Volume(10, 20);
   O.Volume(10);
   O.Volume(10, 20, 30);



}
}
	

