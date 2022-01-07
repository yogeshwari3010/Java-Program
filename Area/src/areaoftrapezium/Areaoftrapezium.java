package areaoftrapezium;

import java.util.Scanner;

public class Areaoftrapezium {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  a, b, h, sum, Area;
		System.out.println("Enter value a= ");
		a=sc.nextDouble();
		System.out.println("Enter value b= ");
		b=sc.nextDouble();
		System.out.println("Enter value h= ");
		h=sc.nextDouble();
		sum=a+b;
		Area=sum/2*h;
		System.out.println("Area of Trapezium = "+Area);
		
	}
}
