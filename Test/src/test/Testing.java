package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Testing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		
		/*System.out.println(str1 +" "+str2);*/
		
		int count[] = new int[27];
		//System.out.println(count[2]);
		for(int i=0;i<str1.length();i++){
			count[str1.charAt(i)-97]++;
		}
		System.out.println(Arrays.toString(count));
		for(int i=0;i<str2.length();i++){
			/*if(count[str2.charAt(i)-97]==0){
				System.out.println(""+str2.charAt(i)+ "  "+count[str2.charAt(i)-97]);
				count[str2.charAt(i)-97]++;
				
			}
			else{*/
				count[str2.charAt(i)-97]--;
			
		}
		
		System.out.println(Arrays.toString(count));
		int sum=0;
		for(int i=0;i<count.length;i++){
			sum=sum+Math.abs(count[i]);
		}
		
		System.out.println(sum);
	}

}
