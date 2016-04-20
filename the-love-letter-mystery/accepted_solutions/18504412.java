import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static void parseIt(String s) {
        int changes = 0;
        
        //System.out.println("Inspecting " + s);
        
        if(new StringBuilder(s)
                    .reverse()
                    .toString()
                    .equals(s)) {
            System.out.println(changes); // 0
            return;
        }
        
        char[] left;
        char[] right;
        
        left = s.substring(0, s.length() / 2).toCharArray();
        right = new StringBuilder(s)
                .reverse()
                .substring(0, s.length() / 2)
                .toCharArray();
        //System.out.println("Left: " + Arrays.toString(left));
        //System.out.println("Right: " + Arrays.toString(right));

        
        for(int i = 0; i < left.length; i++) {
            if(left[i] == right[i]) continue;
            changes += Math.abs(left[i] - right[i]);
        }
        
        System.out.println(changes);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());
        while(cases-- > 0) {
            parseIt(in.nextLine());
        }
       
        in.close();
    }
}