import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int cases = Integer.parseInt(in.nextLine().trim());
        
        for(int c_i = 0; c_i < cases; c_i++)
        {
            long val = Long.parseLong(in.nextLine().trim());
            System.out.println("" + (~val & 0x00000000ffffffffL));
            
        }
    }
}