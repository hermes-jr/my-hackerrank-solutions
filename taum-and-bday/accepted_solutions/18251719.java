import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong(); // number of blacks
            long w = in.nextLong(); // number of whites
            long x = in.nextLong(); // black cost
            long y = in.nextLong(); // white cost
            long z = in.nextLong(); // convert
            
            long sum = 0;
            long x1 = x, y1 = y;
            if(x + z < y) { y1 = z + x; }
            if(y + z < x) { x1 = z + y; }
            x = x1;
            y = y1;
            
            sum = b * x + w * y;
            System.out.println(sum);
        }
    }
}
