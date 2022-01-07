package perimeterofpallelogram;

import java.util.Scanner;

public class Perimeterofpallelogram {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  a, b, perimeter;
		System.out.println("Enter value a= ");
		a=sc.nextDouble();
		System.out.println("Enter value b= ");
		b=sc.nextDouble();
		
		perimeter=2*(a+b);
		System.out.println("Perimeter of parallelogram = "+perimeter);
		
	}
}
