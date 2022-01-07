package percentagecalculation;

import java.util.Scanner;

public class Percentagecalculation {
   public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   int  price, tp;
	   //System.out.println("Enter the quntity: " );
	   //quantity=sc.nextInt();
	   System.out.println("Enter the Price: " );
	   price=sc.nextInt();
	   //formu1 = price*10/100;
	   if(price>1000) {
		   tp=(1000*10)/100;
		   System.out.println("total price is :- "+tp);
		   
	   }else {
		   System.out.println("total price is "+price);
		   
	   }
	   
	   
   }
}
