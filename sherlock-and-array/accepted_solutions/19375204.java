import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        
        caseloop: while(cases-- > 0) {
            int nelem = in.nextInt();
            
            // Instant win
            if(nelem == 1) {
                in.nextInt(); // dump the data
                System.out.println("YES");
                continue caseloop;
            }
            
            // Read the whole data and summarize
            int data[] = new int[nelem];
            int rsum = 0;
            for(int e_i = 0; e_i < nelem; e_i++) {
                data[e_i] = in.nextInt();
                rsum += data[e_i];
            }
            
            // For each element subtract it from sum, compare sums, then add element to the left sum
            int lsum = 0;
            for(int e_i = 0; e_i < nelem; e_i++) {
                rsum -= data[e_i];
                if(rsum == lsum) {
                    // One matching element is enough, no reason to scan whole array
                    System.out.println("YES");
                    continue caseloop;
                }
                lsum += data[e_i];
            }
            
            System.out.println("NO");
        }
    }
}