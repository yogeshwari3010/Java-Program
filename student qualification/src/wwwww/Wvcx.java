package wwwww;

import java.util.Scanner;

public class Wvcx {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int perA, perB;
		System.out.println("Enter the mareks of A :- ");
		perA=sc.nextInt();
		System.out.println("Enter the mareks of B :- ");
		perB=sc.nextInt();
		if(perA>=55 && perB>=45) {
			System.out.println("Student is pass");
			
		}else if(perA>=45 && perA>=55 && perB>=55) {
			System.out.println("Student is pass");	
		}else if(perB<45 && perA>=65) {
			
			System.out.println("Student is allowed to reappear in an exam");	
		}
		else {
			System.out.println("Student is Failed");	
		}
		sc.close();
	}
	
	

}
