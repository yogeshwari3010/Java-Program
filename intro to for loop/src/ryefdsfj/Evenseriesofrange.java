package ryefdsfj;

import java.util.Scanner;

public class Evenseriesofrange {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int i ,n;
		//int c;
		
		System.out.println("Enter the range :-");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			int c;
			c=i*2-1;
		 
		if(i==n) {	
			System.out.printf("%d ",c );
		}
		else {
			
			System.out.printf("%d ",c );
		}
		}s.close();
		
		
	}
}
