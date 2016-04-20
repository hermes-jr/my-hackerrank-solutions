import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Integer len = s.length();
        Integer lower = (int) Math.floor(Math.sqrt(len));
        Integer upper = (int) Math.ceil(Math.sqrt(len));
        // Dafuck is wrong with problem? floor(sqrt(8)) = 2, ceil(sqrt(8)) = 3. 2x3 < 8
        if(upper * lower < len) lower++;
        
        //System.out.println("u: " + upper + " l: " + lower + " len: " + len);
        
        String[][] data = new String[lower][upper];
        int idx = 0;
        String[] parts = s.split("");
        for(int i = 0, z = 0; i < lower; i++) {
            for(int j = 0; j < upper; j++) {
                data[i][j] = z >= len ? null : parts[++z];
                //System.out.println(i + " : " + j + " = " + data[i][j]);
            }
        }

        String encoded = "";
        for(int j = 0; j < upper; j++) {
            for(int i = 0; i < lower; i++) {
                if(data[i][j] != null) encoded += data[i][j];
            }
            encoded += " ";
        }
        System.out.println(encoded);

    }
}
