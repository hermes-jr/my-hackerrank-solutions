import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i > 0; i--) {
            String halfline1;
            String halfline2;
            halfline1 = new String(new char[i-1]).replace("\0", " ");
            halfline2 = new String(new char[n-i+1]).replace("\0", "#");
            System.out.println(halfline1 + halfline2);
        }
    }
}
