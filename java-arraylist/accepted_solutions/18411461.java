import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        
        int cases = Integer.parseInt(in.nextLine().trim());
        while(cases-- > 0) {
            data.add(in.nextLine().trim());
        }
        
        //System.out.println(data);
        
        cases = Integer.parseInt(in.nextLine().trim());
        while(cases-- > 0) {
            String[] q = in.nextLine().trim().split("\\s+");
            int i = Integer.parseInt(q[0]) - 1;
            int j = Integer.parseInt(q[1]);
            if(i < 0 || i > data.size()) {
                System.out.println("ERROR!");
                continue;
            }
            String[] ints = data.get(i).split("\\s+");
            if(j < 1 || j > ints.length - 1) {
                System.out.println("ERROR!");
                continue;
            }
            System.out.println(ints[j]);
        }
        
        in.close();
    }
}