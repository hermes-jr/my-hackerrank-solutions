import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static BitSet createFromString(String s) {
    BitSet t = new BitSet(s.length());
    int lastBitIndex = s.length() - 1;

    for (int i = lastBitIndex; i >= 0; i--) {
        if ( s.charAt(i) == '1'){
            t.set(lastBitIndex - i);                            
        }               
    }

    return t;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine(); // dump newline
        
        ArrayList<BitSet> persons = new ArrayList<>();
        for(int p_i = 0; p_i < n; p_i++){
            persons.add(createFromString(in.nextLine().trim()));
        }

        //System.out.println(persons);
        int maxv = 0,
            maxes = 0;
         
        for(int topic_i=0; topic_i < n; topic_i++){
            for(int topic_j=topic_i + 1; topic_j < n; topic_j++){
                BitSet p1 = persons.get(topic_i);
                BitSet p2 = persons.get(topic_j);
                BitSet sum = (BitSet)p1.clone();
                sum.or(p2);
                
                int isNewMax = sum.cardinality();
                if(isNewMax == maxv) { maxes++; }
                else if(isNewMax > maxv) { maxv = isNewMax; maxes = 1; }
            }
        }
        System.out.println(maxv);
        System.out.println(maxes);
    }
}
