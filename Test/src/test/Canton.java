package test;

import java.util.Scanner;

public class Canton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			
			double rv = Math.sqrt(8*n+1);
			System.out.println(rv);
			double w = Math.floor((rv-1)/2);
			System.out.println(w);
			double t1 = (w*w +w )/2 ;
			System.out.println(t1);
			
			int y = (int) ((int)n-t1);
			int x = (int) (w-y);
			
			System.out.println(x+"/"+y);
			
			
		}
		
	}

}
