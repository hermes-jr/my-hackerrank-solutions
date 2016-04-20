import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] caseOpts = in.nextLine().trim().split("\\s+");
        int rows = Integer.parseInt(caseOpts[0]);
        int cols = Integer.parseInt(caseOpts[1]);
        int rot = Integer.parseInt(caseOpts[2]);
            
        int[][] data = new int[rows][cols];
        for(int r_i=0; r_i < rows; r_i++){
            for(int c_i = 0; c_i < cols; c_i++) {
               data[r_i][c_i] = in.nextInt();
            }
        }
        
 //       System.out.println(Arrays.deepToString(data));

        int lwidth = cols;
        int lheight = rows;
        int lr = 0;
        int lc = 0;
        for(; lwidth > 0 && lheight > 0; lwidth -= 2, lheight -= 2, lr++, lc++) {                            
            // Write current layer to new 1D array
            int llen = lwidth * 2 + 2 * (lheight - 2);
            
            if(llen <= 0) break;
            
            int crot = rot;
            if(crot >= llen) crot %= llen;
            if(crot == 0) break; // No need to rotate this layer (?)

            int[] layer = new int[llen];
            
            //System.out.printf("lwidth: %d lheight: %d\n", lwidth, lheight);
            //System.out.printf("lr: %d lc: %d llen: %d\n", lr, lc, llen);
            
            /* Start from upper left, run clockwise (therefore have to use
            negative valie to do counterclockwise shift as needed for this task,
            but this order is natural for me */
            for(int l_i = 0; l_i < llen && lc >= 0 && lr >= 0; l_i++) {
                layer[l_i] = data[lr][lc];
                // System.out.println("Reading from " + lr + " : " + lc);
                if(l_i < lwidth - 1) { lc++; }
                else if(l_i < lwidth + lheight - 2) { lr++; }
                else if(l_i < lwidth * 2 + lheight - 3) { lc--; }
                else if(l_i < lwidth * 2 + lheight * 2 - 4) { lr--; }
            }
            
            // Rotate current layer
            int[] rotated = new int[llen];
            System.arraycopy(layer, crot, rotated, 0, llen - crot);
            System.arraycopy(layer, 0, rotated, llen - crot, crot);
            
           //System.out.println(Arrays.toString(layer));
           //System.out.println(Arrays.toString(rotated));
            
            // Move rotated data back
            for(int l_i = 0; l_i < llen && lc >= 0 && lr >= 0; l_i++) {
                data[lr][lc] = rotated[l_i];
                // System.out.println("Writing to " + lr + " : " + lc);
                if(l_i < lwidth - 1) { lc++; }
                else if(l_i < lwidth + lheight - 2) { lr++; }
                else if(l_i < lwidth * 2 + lheight - 3) { lc--; }
                else if(l_i < lwidth * 2 + lheight * 2 - 4) { lr--; }
            }
            
        }

        // System.out.println(Arrays.deepToString(data));
        
        for(int[] dr: data) {
            for(int dt: dr) {
                System.out.print(dt + " ");
            }
            System.out.println();
        }
    }
}