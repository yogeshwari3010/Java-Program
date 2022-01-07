package ryefdsfj;

import java.util.Scanner;

public class cubeforrange {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int i ,n;
		System.out.println("Enter the range :-");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println(i*i*i );
			
		}
		s.close();
	}

}
