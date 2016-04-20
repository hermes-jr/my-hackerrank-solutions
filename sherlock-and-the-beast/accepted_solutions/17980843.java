import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            breakIt(n);
        }
    }
    
    public static void breakIt(Integer crackMe) {
        // Would be a max value
        if(crackMe % 3 == 0) {
            System.out.println(repeat("5", crackMe));
            return;
        }

        int fives = crackMe / 3;
        int threes = 0;
        do {
            int lo = crackMe;
            if(fives > 0) lo = crackMe - fives * 3;
            if(lo > 0 && lo % 5 == 0) {
                threes = lo / 5;
                break;
            }
            fives--;
        } while (threes >= 0 && fives >= 0);
        if(fives > 0 || threes > 0)
        {
            System.out.println(repeat("5", fives * 3) + repeat("3", threes * 5));
            return;
        }
        // Nothing found
        System.out.println("-1");           
    }
    
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}
