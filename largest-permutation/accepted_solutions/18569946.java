import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int n = in.nextInt();
        int swaps = in.nextInt();
    
        int[] data = new int[n];
        int[] index = new int[n + 1];
    
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
            index[data[i]] = i;
        }
    
        in.close();
    
        for (int i = 0; i < n && swaps > 0; i++) {
            if (data[i] == n - i) {
                continue; // element is in place
            }
            // else swap
            data[index[n - i]] = data[i];
            index[data[i]] = index[n - i];
            data[i] = n - i;
            index[n - i] = i;
            swaps--;
        }
    
        // print an answer
        for (Integer i: data) {
            System.out.print(i + " ");
        }
    }

}

