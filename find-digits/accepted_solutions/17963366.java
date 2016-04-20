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
            long n = in.nextLong();
            long gg = n;
            int answ = 0;
            do{
                long z = n % 10;
                if(z != 0 && n!= 0 && gg % z == 0) answ++;
                n /= 10;
            } while  (n > 0);
            System.out.println(answ);
            
        }
    }
}
