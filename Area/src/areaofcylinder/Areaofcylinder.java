package areaofcylinder;

import java.util.Scanner;

public class Areaofcylinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  r, h, area;
		System.out.println("Enter value r= ");
		r=sc.nextDouble();
		System.out.println("Enter value h= ");
		h=sc.nextDouble();
		area=(2*3.14*r*h)+(2*3.14*r*r);
		System.out.println("Area of Cylinder = "+area);
		
	}	

}
