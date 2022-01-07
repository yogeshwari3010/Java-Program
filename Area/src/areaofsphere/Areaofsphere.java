package areaofsphere;

import java.util.Scanner;

public class Areaofsphere {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  r, area;
		System.out.println("Enter value r= ");
		r=sc.nextDouble();
		area=4*3.14*r*r;
		System.out.println("Area of sphere  = "+area);
		sc.close();
		
}
}
