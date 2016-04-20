import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int pairs(Map<Integer, Short> a,int k) {
      /* Complete this function */
        int counter = 0;
        for(Integer z: a.keySet()) {
            if(a.containsKey(new Integer(z - k))) {
                counter++;
                continue;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);
        
        Map<Integer, Short> data = new TreeMap<>();
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            data.put(_a_item, (short)1);
        }
        
        res = pairs(data,_k);
        System.out.println(res);
    }
}
