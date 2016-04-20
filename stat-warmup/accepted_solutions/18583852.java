import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int elts = in.nextInt();
        int[] data = new int[elts];
        int[] sortedData = new int[elts];
        
        long totalsum = 0L;
        
        for(int i = 0; i < elts; i++) {
            data[i] = in.nextInt();
            totalsum += data[i];
        }
        
        //System.out.println(Arrays.toString(data));
        
        // mean
        double mean = totalsum / (double)elts;
        System.out.printf("%.1f\n", mean);
        
        // median
        System.arraycopy(data, 0, sortedData, 0, data.length);
        Arrays.sort(sortedData);
        
        double median = 0.0;
        if(sortedData.length % 2 == 0) {
            int v1 = sortedData[sortedData.length / 2 - 1];
            int v2 = sortedData[sortedData.length / 2];
            median = (v1 + v2) / 2.0;
        }
        else {
            median = (double)sortedData[sortedData.length / 2];
        }
        System.out.printf("%.1f\n", median);
        
        //  for standard deviation
        long sqSums = 0L;
        
        // maximum times and a number seen
        int[] md = new int[]{sortedData[0], 1};
        
        HashMap<Integer, Integer> occs = new HashMap<>(elts);
        for(int i = 0; i < elts; i++) {
            
            // calculate times seen
            if(occs.containsKey(sortedData[i])) {
                int nv = occs.get(sortedData[i]) + 1;
                if(nv > md[1]) {
                    md[0] = sortedData[i];
                    md[1] = nv;
                }
                occs.put(sortedData[i], nv);
            }
            else
            {
                occs.put(sortedData[i], 1);
            }
            
            // add to standard deviation squares sum to use one cycle
            sqSums += Math.pow((sortedData[i] - mean), 2);
        }
        
        //System.out.println(occs);
        // mode:
        System.out.println(md[0]);
        
        // standard deviation:
        double stDev = Math.sqrt(sqSums / elts);
        System.out.printf("%.1f\n", stDev);
        
        // confidence interval:
        double marg = 1.96 * stDev / Math.sqrt(elts);
        System.out.printf("%.1f %.1f\n", mean - marg, mean + marg);
   }
}