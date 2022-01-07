package areaofparallelogram;

import java.util.Scanner;

public class Areaofparallelogram {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  b, h, area;
		System.out.println("Enter value b= ");
		b=sc.nextDouble();
		System.out.println("Enter value h= ");
		h=sc.nextDouble();
		area=b*h;
		System.out.println("Area of Parallelogram = "+area);
		
	}

}
