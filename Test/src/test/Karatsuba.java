package test;
import java.math.BigInteger;
import java.util.Scanner;

public class Karatsuba {
    private final static BigInteger ZERO = new BigInteger("0");

    public static BigInteger karatsuba(BigInteger x, BigInteger y) {

        // cutoff to brute force
        int N = Math.max(x.bitLength(), y.bitLength());
        System.out.println(N);
        if (N <= 2000) return x.multiply(y);                // optimize this parameter

        // number of bits divided by 2, rounded up
        N = (N / 2) + (N % 2);
        System.out.println(N);

        // x = a + 2^N b,   y = c + 2^N d
        BigInteger b = x.shiftRight(N);
        System.out.println(b);
        BigInteger a = x.subtract(b.shiftLeft(N));
        System.out.println(a);
        BigInteger d = y.shiftRight(N);
        System.out.println(d);
        BigInteger c = y.subtract(d.shiftLeft(N));
        System.out.println(c);

        // compute sub-expressions
        BigInteger ac    = karatsuba(a, c);
        BigInteger bd    = karatsuba(b, d);
        BigInteger abcd  = karatsuba(a.add(b), c.add(d));

        return ac.add(abcd.subtract(ac).subtract(bd).shiftLeft(N)).add(bd.shiftLeft(2*N));
    }

 
    public static void main(String[] args) {
       /* long start, stop, elapsed;
        Random random = new Random();*/
        //int N = Integer.parseInt(args[0]);
       // BigInteger a = new BigInteger(N, random);
    	
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	while(n>0){
    		String s1 = sc.next();
    		
    		BigInteger a = new BigInteger(s1);
    		
    		String s2 = sc.next();
            BigInteger b =  new BigInteger(s2);
            BigInteger c = karatsuba(a, b);
            System.out.println(c);
            n = n-1;
    	}
        

    //    start = System.currentTimeMillis(); 
        
        //stop = System.currentTimeMillis();
       // System.out.println(stop - start);

      /*  start = System.currentTimeMillis(); 
        BigInteger d = a.multiply(b);
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
        
        System.out.println((c.equals(d)));*/
        
        
    }
}