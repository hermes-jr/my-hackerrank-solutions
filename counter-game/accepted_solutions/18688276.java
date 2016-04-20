import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static void process(String line) {
        // instant win
        try {
            if(Integer.parseInt(line) == 1) { System.out.println("Richard"); return; }
        } catch (Exception e) {}
        
        int moves = 0;
        BigInteger counter = new BigInteger(line);
        
        while(counter.compareTo(new BigInteger("1")) > 0) {
            BitSet asbits = BitSet.valueOf(counter.toByteArray());
            //System.out.println("BS: " + asbits);
            
            if(asbits.cardinality() == 1) {
                //System.out.println("Counter is a power of 2: " + counter);
                counter = counter.shiftRight(1);
                moves++;
            }
            else {
                //System.out.println(counter + " is not a power of 2, reducing");
                int maxbit = 0;
                for(int i = 0; i <= counter.bitLength(); i++) {
                    //System.out.println("Testing bit: " + i + " : " + counter.testBit(i));
                    if(counter.testBit(i)) maxbit = i;
                }
                //System.out.println("Maxbit set is: " + maxbit + " bc: " + counter.bitCount());
                counter = counter.clearBit(maxbit);
                //System.out.println(counter + " <- new val");
                moves++;
            }
        }
        if(moves % 2 == 0) {
            System.out.println("Richard");
        }
        else {
            System.out.println("Louise");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        while(cases-- > 0) {
            process(in.nextLine().trim());
        }
    }
}