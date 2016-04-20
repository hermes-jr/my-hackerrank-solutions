import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> sticks = new ArrayList<Integer>();
        for(int arr_i=0; arr_i < n; arr_i++){
            sticks.add(in.nextInt());
        }

        Integer smallest = sticks.get(0);
        while(!sticks.isEmpty()) {
            System.out.println(sticks.size());
            
            // Cut
            Collections.sort(sticks);
            int shortSize = sticks.get(0);
            if(shortSize == 0) break;
            for(Iterator<Integer> i = sticks.iterator(); i.hasNext();) {
               Integer stick = i.next();
               stick -= shortSize;
               if(stick == 0) i.remove();
            }
        }
            
    }
}
