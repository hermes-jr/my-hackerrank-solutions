import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int c_i = 0; c_i < cases; c_i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            long psum = a;
            for(int i = 0; i < n; i++) {
                psum += Math.pow(2, i) * b;
                System.out.print(psum + " ");
            }
            System.out.println("");
        }
    }
}