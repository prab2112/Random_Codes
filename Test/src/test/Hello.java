package test;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int data[] = new int[] {5,7,4,9,5,7,4};
		
		int result = 0;
		for(int i=0;i<data.length;i++){
			result ^= data[i];
			//System.out.println(result);
		}
		
		System.out.println(result);*/
		
		/*if(25  5 == 0){
			System.out.println("true");
		}*/
		int n = 27;
		System.out.println(n<<1);
		System.out.println(n&1);
		if ( (n&1) == 1 )
	        n <<= 1;
		
	     
	    float x = n;
	    System.out.println(x);
	    System.out.println((int)x*0.1);
	    x = ( (int)(x*0.2) )*5;
	    System.out.println(x); 
	    /* If last digit of n is 0 then n will be equal to (int)x */
	    if ( (int)x == n )
	    	System.out.println("True");
	}

}
