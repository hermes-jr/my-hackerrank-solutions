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
            int n = in.nextInt();
            //a(n) = if n is even then a(n-1)+1 else 2*a(n-1). 
            int size = 1;
            for(int cycle = 0; cycle < n; cycle++) {
                if(cycle % 2 != 0) {
                    size++;
                }
                else {
                    size *= 2;
                }
            }
            System.out.println(size);
            
        }
    }
}
