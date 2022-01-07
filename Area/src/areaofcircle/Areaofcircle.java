package areaofcircle;

import java.util.Scanner;

public class Areaofcircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  r,y=3.14,area;
		System.out.println("Enter value r= ");
		r=sc.nextDouble();
		area=y*r;
		System.out.println("Area of circle = "+area);
		
	}
}
