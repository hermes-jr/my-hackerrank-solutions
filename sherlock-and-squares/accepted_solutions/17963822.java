import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        for(int tc = 0; tc < cases; tc++) {
            long a = in.nextLong();
            long b = in.nextLong();
            int answ = 0;
            firstsquare:
            for(long testMe = a; testMe <= b; testMe++) {
                long sqrt = (long) Math.sqrt(testMe);
	            if(Math.pow(sqrt, 2) == testMe) {
                    for(long csq = sqrt; Math.pow(csq, 2) <= b; csq++) {
                        answ++;
                    }
                    break firstsquare;
                }
            }
            System.out.println(answ);
        }
    }
}