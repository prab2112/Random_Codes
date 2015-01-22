package test;

import java.util.Arrays;
import java.util.Scanner;

public class BikeRacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m=sc.nextInt();
		k=sc.nextInt();
		long bikers[][] = new long[n][2];
		long bike[][]=new long[m][2];
		
		for(int i=0;i<n;i++){
			bikers[i][0]=sc.nextInt();
			bikers[i][1]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			bike[i][0]=sc.nextInt();
			bike[i][1]=sc.nextInt();
		}
		
		
		long dist[] = new long[m>n?m:n];
		int d1=0;
		for(int i=0;i<n;i++){
			long mind = Long.MAX_VALUE;
			System.out.println(mind);
			for(int j=0;j<m;j++){
				long d = (long)Math.sqrt(Math.pow((bikers[i][0]-bike[j][0]), 2)+Math.pow((bikers[i][1]-bike[j][1]), 2));
				if(d<mind){
					mind =d;
				}
			}
			System.out.println(mind);
			dist[d1] = mind;
		}
		
		Arrays.sort(dist);
		System.out.println(Arrays.toString(dist));
		long ans = 0;
		for(int i=0;i<k;i++){
			
			ans=+dist[i];
					
			
		}
		
		System.out.println(ans*ans);
	}

}
