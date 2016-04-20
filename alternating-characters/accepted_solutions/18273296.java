import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        for(int c_i = 0; c_i < cases; c_i++) {
            String line = in.nextLine()
                .toUpperCase()
                .trim()
                .replaceAll("\\s","");
            
            Character prev = null;
            int replaces = 0;
            
            for(Character cur: line.toCharArray()) {
                if(prev != null && prev.equals(cur)) replaces++;
                prev = cur;
            }
            
            System.out.println(replaces);
        }
    }
}