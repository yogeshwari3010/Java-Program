package qqqqqqqq;

import java.util.Scanner;

public class Zzzzzz {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Input a char:- ");
		char c=sc.next().charAt(0);
		
		System.out.println("You have entered Chartecter is = "+c);
		if(c>=65 && c<=90) {
			System.out.println("Charecter is Capital");
			
		}else if(c>=97 && c<=122) {
			System.out.println("Charter is Small");
			
		}else if(c>=48 && c<=57) {
		  System.out.println("c is number");
		  
			
		}else {
			System.out.println("you have enter a special char");
		}
	
		 
		 
		
	}

}
