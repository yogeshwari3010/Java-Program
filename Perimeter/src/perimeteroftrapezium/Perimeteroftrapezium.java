package perimeteroftrapezium;

import java.util.Scanner;

public class Perimeteroftrapezium {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  a, b, c, d, perimeter;
		System.out.println("Enter value a= ");
		a=sc.nextDouble();
		System.out.println("Enter value b= ");
		b=sc.nextDouble();
		System.out.println("Enter value c= ");
		c=sc.nextDouble();
		System.out.println("Enter value d= ");
		d=sc.nextDouble();
		
		perimeter=a+b+c+d;
		System.out.println("Volume of trapezium = "+perimeter);
		
	}

}
