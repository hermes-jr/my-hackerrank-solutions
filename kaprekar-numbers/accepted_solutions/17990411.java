import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long low = in.nextInt();
        long hi = in.nextInt();
        int found = 0;
        for(; low <= hi; low++) {
            long pow = low * low;
            // System.out.println("pow" + pow);
            String ass = "" + pow;
            int assLen = ass.length();

            if(assLen % 2 != 0) { ass = "0" + ass; assLen++; }
            
            long lp;
            try {
               lp = Integer.parseInt(ass.substring(0, assLen / 2));
            } catch(Exception e) { lp = 0; }
    
            long rp;
            try {
               rp = Integer.parseInt(ass.substring(assLen / 2));
            } catch(Exception e) { rp = 0; }
            // System.out.println(ass + " : " + lp + " " + rp);
            
            if(rp + lp == low) {
                found++;
                System.out.print(rp + lp + " ");
            }
        }
        if(found == 0) System.out.println("INVALID RANGE");
    }
}