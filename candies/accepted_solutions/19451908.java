import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int children = in.nextInt();
        
        int[] data = new int[children];
        int[] candies = new int[children];
        candies[0] = 1;
        
        for(int i = 0; i < children; i++) {
            int rating = in.nextInt();
            data[i] = rating;
            if(i == 0) continue;
            if(data[i - 1] < rating) {
                candies[i] = candies[i - 1] + 1;
            }
            else {
                candies[i] = 1;
            }
        }

        //System.out.println(Arrays.toString(data));
        //System.out.println(Arrays.toString(candies));
        
        for(int i = children - 1; i >= 1; i--) {
            if(data[i - 1] > data[i] && candies[i - 1] <= candies[i]) {
                candies[i - 1] = candies[i] + 1;
            }
        }

        //System.out.println(Arrays.toString(candies));
        
        long sum = 0L;
        for(int z : candies) {
            sum += z;
        }
         System.out.println(sum);
    }
}