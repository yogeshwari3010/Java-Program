package perimeteroftriangle;

import java.util.Scanner;

public class Perimeteroftriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  a, b, c, perimeter;
		System.out.println("Enter value a= ");
		a=sc.nextDouble();
		System.out.println("Enter value b= ");
		b=sc.nextDouble();
		System.out.println("Enter value c= ");
		c=sc.nextDouble();
		perimeter=a+b+c;
		System.out.println("Volume of rhombus = "+perimeter);
		
	}

}
