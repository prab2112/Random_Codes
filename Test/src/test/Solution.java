import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'pointsBelong' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER y1
     *  3. INTEGER x2
     *  4. INTEGER y2
     *  5. INTEGER x3
     *  6. INTEGER y3
     *  7. INTEGER xp
     *  8. INTEGER yp
     *  9. INTEGER xq
     *  10. INTEGER yq
     */

    public static int pointsBelong(int x1, int y1, int x2, int y2, int x3, int y3, int xp, int yp, int xq, int yq) {
        
        double ab = distance(x1, y1, x2, y2);
        double bc = distance(x2, y2, x3, y3);
        double ac = distance(x1, y1, x3, y3);
        if(!((Math.abs(ab) + Math.abs(bc) > Math.abs(ac)) &&
            (Math.abs(bc) + Math.abs(ac) > Math.abs(ab)) &&
            (Math.abs(ab) + Math.abs(ac) > Math.abs(bc)))) return 0;
        
        
        double A = area(x1, y1, x2, y2, x3, y3);
        double p1 = area(xp, yp, x2, y2, x3, y3);
        double p2 = area(x1, y1, xp, yp, x3, y3);
        double p3 = area(x1, y1, x2, y2, xp, yp);
        
        double q1 = area(xq, yq, x2, y2, x3, y3);
        double q2 = area(x1, y1, xq, yq, x3, y3);
        double q3 = area(x1, y1, x2, y2, xq, yq);
        
        if(A == (p1+p2+p3) && (A==q1+q2+q3)) return 3;
        if(A == (p1+p2+p3) ) return 1;
        if((A==q1+q2+q3)) return 2;
        return 4;
        
    }
    
    static double area(int x1, int y1, int x2, int y2, int x3, int y3){
        return Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2.0);
    }
    
    static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int x1 = Integer.parseInt(bufferedReader.readLine().trim());

        int y1 = Integer.parseInt(bufferedReader.readLine().trim());

        int x2 = Integer.parseInt(bufferedReader.readLine().trim());

        int y2 = Integer.parseInt(bufferedReader.readLine().trim());

        int x3 = Integer.parseInt(bufferedReader.readLine().trim());

        int y3 = Integer.parseInt(bufferedReader.readLine().trim());

        int xp = Integer.parseInt(bufferedReader.readLine().trim());

        int yp = Integer.parseInt(bufferedReader.readLine().trim());

        int xq = Integer.parseInt(bufferedReader.readLine().trim());

        int yq = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pointsBelong(x1, y1, x2, y2, x3, y3, xp, yp, xq, yq);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
