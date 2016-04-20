import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int stream[] = new int[n];
        ArrayList<Integer> data = new ArrayList<Integer>();
        for(int stream_i=0; stream_i < n; stream_i++){
            data.add(in.nextInt());
        }
        Collections.sort(data);
 
        double median = 0;
        if(n % 2 != 0)
        {
            median = data.get((int)Math.floor(n/2.0));
        }
        else
        {
            int a = data.get(n/2);
            int b = data.get(n/2 + 1);
            median = (a+b)/2.0;
        }
        System.out.println(Math.round(median));
    }
}