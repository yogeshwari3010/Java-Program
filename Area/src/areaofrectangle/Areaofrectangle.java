package areaofrectangle;

import java.util.Scanner;

public class Areaofrectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  l, w, area;
		System.out.println("Enter value l= ");
		l=sc.nextDouble();
		System.out.println("Enter value w= ");
		w=sc.nextDouble();
		area=l*w;
		System.out.println("Area of rectangle = "+area);
		
	}

}
