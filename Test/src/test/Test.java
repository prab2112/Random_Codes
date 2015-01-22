package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i>0;i++){
			long val = (long) (7*(Math.pow(i, 25)) - 10); 
			System.out.println(val);
			if(val/83==0){
				System.out.println(i);
				i=-1;
			}
		}
	}

}
