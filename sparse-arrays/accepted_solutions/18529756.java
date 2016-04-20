import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Map<String, Integer> occs = new TreeMap<>();
        
        int n = Integer.parseInt(in.nextLine());
        while(n-- > 0) {
            String line = in.nextLine().trim();
            if(occs.containsKey(line)) {
                occs.put(line, occs.get(line) + 1);
            } else {
                occs.put(line, 1);
            }
            
        }
        
        int q = Integer.parseInt(in.nextLine());
        while(q-- > 0) {
            String line = in.nextLine().trim();
            if(!occs.containsKey(line)) {
                System.out.println(0);
                continue;
            }
            System.out.println(occs.get(line));
        }
        
        in.close();
    }
}