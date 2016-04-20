import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums = in.nextInt();
        int[] data = new int[100];
        while(nums-- > 0) {
            int cnum = in.nextInt();
            in.nextLine(); // discard the rest of the string
            data[cnum]++;
        }
        int psum = 0;
        for(int i = 0; i < 100; i++) {
            if(data[i] > 0) {
               psum += data[i];
            }
            System.out.print(psum + " ");
        }
    }
}