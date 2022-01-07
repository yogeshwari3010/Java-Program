package areaofeqilateraltriangle;

import java.util.Scanner;

public class areaofeqilateraltriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double  a, sqr, area;
		System.out.println("Enter value a= ");
		a=sc.nextDouble();
		sqr=a*a;
		area=(1.73*sqr)/4;
		System.out.println("Area of eqilateraltriangle  = "+area);
		sc.close();
		
}
}
