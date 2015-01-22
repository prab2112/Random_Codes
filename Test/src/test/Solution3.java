package test;
import java.util.Arrays;
import java.util.Scanner;


public class Solution3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int m= sc.nextInt(),n=sc.nextInt();
			int x[] = new int[m-1];
			int y[] = new int[n-1];
			for(int i=0;i<x.length;i++)
				x[i]=sc.nextInt();
			for(int i=0;i<y.length;i++)
				y[i]=sc.nextInt();
			
			
			Arrays.sort(y);
			Arrays.sort(x);
			
			
			int cx =0 ,cy=0;
			int i=x.length-1,j=y.length-1;
			int minCost = 0;
			while(i>=0||j>=0){
				if(j<0)
				{
					minCost+=(x[i]*(cy+1));
					i--;
				}
				else if(i<0){
					minCost+=(y[j]*(cx+1));
					j--;
				}
				else
				{
					if(x[i]>y[j]){
						cx++;
						minCost+=(x[i]*(cy+1));
						i--;
					}else if(y[j]>x[i]){
						cy++;
						minCost+=(y[j]*(cx+1));
						j--;
					}else if(x[i]==y[j]){
						if(cx>cy){
							minCost+=(x[i]*(cy+1));
							//if(i>0)
							i--;
							cx++;
						}
						else{
							minCost+=(y[j]*(cx+1));
							j--;
							cy++;
						}
					}
				}
				
			}
			
			System.out.println(minCost);
			
		}

	}

}
