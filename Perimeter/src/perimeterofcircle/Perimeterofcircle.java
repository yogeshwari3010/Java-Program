package perimeterofcircle;

import java.util.Scanner;

public class Perimeterofcircle {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  r, perimeter;
		System.out.println("Enter value r= ");
		r=sc.nextDouble();
		perimeter=2*3.14*r;
		System.out.println("Perimeter of circle  = "+perimeter);
		sc.close();
		
}
}
