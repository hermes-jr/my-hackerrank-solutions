import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int[] cntrs = new int[3];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            int z = in.nextInt();
            if(z > 0) { 
                cntrs[0]++;
            }
            else if(z < 0){
                cntrs[1]++;
            }
            else{
                cntrs[2]++;
            }
        }
        
        System.out.println((double)cntrs[0]/n);        
        System.out.println((double)cntrs[1]/n);        
        System.out.println((double)cntrs[2]/n);        
                

    }
}
