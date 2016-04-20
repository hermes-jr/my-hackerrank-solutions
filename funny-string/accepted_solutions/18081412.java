import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        for(int i = 0; i < cases; i++) {
            char[] word = in.nextLine().toCharArray();

            boolean isFunny = true;
            
            int wlen = word.length;
            if(wlen > 1) {
                for(int j = 0; j < wlen - 1; j++) {
                    int v1 = word[j] - word[j + 1];
                    int v2 = word[wlen - j - 1] - word[wlen - j - 2];
                    if((int)Math.abs(v1) != (int)Math.abs(v2)) {
                        isFunny = false;
                        break;
                    }
                }
            }
            
            System.out.println(isFunny ? "Funny" : "Not Funny");
        }
    }
}