import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] data = new int[n];
        for(int d_i = 0; d_i < n; d_i++) {
            data[d_i] = in.nextInt();
        }
        
        int sums = 0;
        
        for(int len = 1; len <= n; len++) {
            for(int offs = 0; offs < n - len + 1; offs++) {
                int sum = 0;
                for(int z = offs; z < offs+len; z++) sum += data[z];
                if(sum < 0) sums++;
            }
        }
        
        System.out.println(sums);
    }
}