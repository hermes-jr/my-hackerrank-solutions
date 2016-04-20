import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        
        casefor:
        for(int c_i = 0; c_i < cases; c_i++) {
            boolean answer = false;
            
            String s1 = in.nextLine().trim().toLowerCase();
            String s2 = in.nextLine().trim().toLowerCase();

            Set<Character> s1stat = new HashSet<>();
            Set<Character> s2stat = new HashSet<>();
            
            // calculate freqs
            for(Character c: s1.toCharArray()) {
                s1stat.add(c);
            }
            for(Character c: s2.toCharArray()) {
                s2stat.add(c);
            }
            
            s1stat.retainAll(s2stat);
            if(!s1stat.isEmpty()) { answer = true; } 
                        
            // System.out.println("Before opt: " +  s1stat + " ||| " + s2stat);
                                
            System.out.println(answer ? "YES" : "NO");
                       
        }
        in.close();
    }
}