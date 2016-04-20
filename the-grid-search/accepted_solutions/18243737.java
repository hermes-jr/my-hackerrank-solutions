import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        for(int cs_i = 0; cs_i < cases; cs_i++){
            String[] caseOpts = in.nextLine().trim().split("\\s+");
            int R = Integer.parseInt(caseOpts[0]);
            int C = Integer.parseInt(caseOpts[1]);
            
            int[][] data = new int[R][C];
            for(int r_i=0; r_i < R; r_i++){
                char[] line = in.nextLine().trim().toCharArray();
                for(int c_i = 0; c_i < line.length; c_i++) {
                    data[r_i][c_i] = Integer.parseInt(line[c_i] + "");
                }
            }
            caseOpts = in.nextLine().trim().split("\\s+");
            int r = Integer.parseInt(caseOpts[0]);
            int c = Integer.parseInt(caseOpts[1]);
            int[] subdata = new int[r * c];
            int x_i = 0;
            for(int r_i=0; r_i < r; r_i++){
                char[] line = in.nextLine().trim().toCharArray();
                for(int c_i = 0; c_i < line.length; c_i++) {
                    subdata[x_i++] = Integer.parseInt(line[c_i] + "");
                }
            }
            
            //System.out.println(Arrays.deepToString(data));
            //System.out.println(Arrays.toString(subdata));
            
            int maxC = C - c + 1;
            int maxR = R - r + 1;
            
            // Instant fail cases
            if( (maxR < 0 || maxC < 0 ) ||
                (R == r && C == c && data[0][0] != subdata[0]) ) {
                System.out.println("NO");
                continue;
            }
            
            Boolean contains = false;
            
            outer:
            for(int r_i=0; r_i < maxR; r_i++){
                inner:
                for(int c_i=0; c_i < maxC; c_i++){                    
                    int sx_i = 0;
                    for(int sr_i=r_i; sr_i < r_i + r; sr_i++){
                        for(int sc_i=c_i; sc_i < c_i + c; sc_i++){
                            if(subdata[sx_i++] != data[sr_i][sc_i]) { continue inner; }
                        }
                    }
                    contains = true;
                    break outer;
                    //System.out.println(Arrays.toString(subc) + " compare to " + Arrays.toString(subdata) );
                }
            }

            System.out.println(contains ? "YES" : "NO");
        }
    }
}