package perimeterofcylinder;

import java.util.Scanner;

public class Perimeterofcylinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  d, h, perimeter;
		System.out.println("Enter value d= ");
		d=sc.nextDouble();
		System.out.println("Enter value h= ");
		h=sc.nextDouble();
		
		perimeter=(2*d)+(2*h);
		System.out.println("Perimeter of cylinder = "+perimeter);
		
	}
}
