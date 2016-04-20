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
            int c = in.nextInt();
            int m = in.nextInt();
            int choks = 0;
            choks = n/c;
            int wraps = choks;
            do{
                int free = wraps/m;
                choks += free;
                wraps -= free*m;
                wraps += free;
            } while (wraps >= m);
            System.out.println(choks);
        }
    }
}
