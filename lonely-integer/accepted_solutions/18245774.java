import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            //System.out.println("inspecting " + _a_item);
            res = res ^ _a_item;
        }
        
        //res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
