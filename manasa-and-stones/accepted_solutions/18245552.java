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
            int n = Integer.parseInt(in.nextLine().trim()) - 1;
            int pa = Integer.parseInt(in.nextLine().trim());
            int pb = Integer.parseInt(in.nextLine().trim());
            int a = pa;
            int b = pb;
            if(pa > pb) { b = pa; a = pb; }
            
            HashSet<Long> answers = new HashSet<>();
            
            long fval = a * n; // Lowest possible value
            answers.add(fval);
            for(int i = 0; i < n; i++) {
                fval = fval - a + b;
                // System.out.println(fval + " <- new found " + answers);
                if(fval >= 0L) answers.add(fval);

            }
            LinkedList<Long> answers2 = new LinkedList(answers);
            Collections.sort(answers2);
            for(Long ans: answers2) { System.out.print(ans + " "); }
            System.out.println();
        }
    }
}