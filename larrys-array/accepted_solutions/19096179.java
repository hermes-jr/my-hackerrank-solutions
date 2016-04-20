import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        while(cases-- > 0) {
            int arrItems = Integer.parseInt(in.nextLine().trim());
            int[] data = new int[arrItems];
            for(int i = 0; i < arrItems; i++) {
                data[i] = in.nextInt();
            }
            
            if(in.hasNextLine()) in.nextLine(); // Dump a newline character
            
            //System.out.println(Arrays.toString(data));
            
            int swaps = 0;
            for (int i = 0; i < arrItems - 1; i++) {
                for (int j = i + 1; j < arrItems; j++) {
                    if (data[i] > data[j]) swaps++;
                }
            }
            
            System.out.println( (swaps % 2 == 0) ? "YES": "NO");
            
       }
    }
}