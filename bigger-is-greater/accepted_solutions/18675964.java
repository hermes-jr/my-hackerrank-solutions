import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    // from http://codeforces.com/blog/entry/3980
    static boolean next_permutation(char[] p) {
  for (int a = p.length - 2; a >= 0; --a)
    if (p[a] < p[a + 1])
      for (int b = p.length - 1;; --b)
        if (p[b] > p[a]) {
          char t = p[a];
          p[a] = p[b];
          p[b] = t;
          for (++a, b = p.length - 1; a < b; ++a, --b) {
            t = p[a];
            p[a] = p[b];
            p[b] = t;
          }
          return true;
        }
  return false;
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        while(cases-- > 0) {
            String line = in.nextLine();
            
            char[] letters = line.toCharArray();
            if(line.length() != 1 && next_permutation(letters) && !(new String(letters)).equals(line)) {
                System.out.println(new String(letters));
            }
            else {
                System.out.println("no answer");
            }
        }
    }
}