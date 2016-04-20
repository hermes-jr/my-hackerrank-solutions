import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int da = in.nextInt();
        int ma = in.nextInt();
        int ya = in.nextInt();
        int de = in.nextInt();
        int me = in.nextInt();
        int ye = in.nextInt();
        
        int fine = -1;
        if(ya < ye) { fine = 0; }
        else if(ya <= ye && ma < me) { fine = 0; }
        else if(ya <= ye && ma <= me && da < de) { fine = 0; }
        else {
            if(ya == ye) {
                fine = Math.abs(ma - me) * 500;
                if(ma == me) fine = Math.abs(de - da) * 15;
            }
            else {
                fine = 10000;
            }
        }
        
        System.out.println(fine);
    }
}
