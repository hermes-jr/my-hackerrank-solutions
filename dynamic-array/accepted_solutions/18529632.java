import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seqs = in.nextInt();
        if(in.hasNextLine()) in.nextLine(); // dump newline
        
        int lastans = 0;
        ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>(seqs);
        //System.out.println("Total seqs: " + seqs);
        
        for(int i = 0; i < seqs; i++ ) {
           data.add(i, new ArrayList<Integer>());
        }
            
        //System.out.println("Initial data: " + data);
        
        while(in.hasNextLine()) {
            String[] cmd = in.nextLine().trim().split("\\s+");
            int qt = Integer.parseInt(cmd[0]);
            int x = Integer.parseInt(cmd[1]);
            int y = Integer.parseInt(cmd[2]);
            
            int seqn = (x ^ lastans) % seqs;
            //System.out.println("seqn: " + seqn);
            
            if(qt == 1) {
                // insert y to the end of (x ^ lastans) % seqs
                ArrayList<Integer> seq = data.get(seqn);
                seq.add(y);
                data.set(seqn, seq);
                
                //System.out.println("new seq = " + seq);
                //System.out.println("whole data: " + data);
            }
            else if(qt == 2) {
                // print y % sizeth of (x ^ lastans) % seqs
                // then lastans = this val
                int val = 0;
                ArrayList<Integer> seq = data.get(seqn);
                int subs = seq.size();
                
                //System.out.println("size of: " + seqn + " is: " + subs);
                if(subs != 0) {
                    val = seq.get(y % subs);
                }
                
                System.out.println(val);
                lastans = val;
            }
        }
    }
}