import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        
        casefor:
        for(int c_i = 0; c_i < cases; c_i++) {
            int answer = 0;
            
            String istr = in.nextLine().trim().toLowerCase();
            int totalLen = istr.length();
            
            // instant fail case
            if(totalLen % 2 != 0) {
                System.out.println("-1");
                continue;
            }
            
            String s1 = istr.substring(0, totalLen / 2);
            String s2 = istr.substring(totalLen / 2, totalLen);

            // instant win
            if(s1.equals(s2)) {
                System.out.println("0");
                continue;
            }

 //           System.out.println(s1 + " + " + s2);

            Map<Character,Integer> s1stat = new HashMap<>();
            Map<Character,Integer> s2stat = new HashMap<>();
            
            // calculate freqs
            for(Character c: s1.toCharArray()) {
                if(!s1stat.containsKey(c)) { s1stat.put(c, 1); }
                else s1stat.put(c, s1stat.get(c) + 1);
            }
            for(Character c: s2.toCharArray()) {
                if(!s2stat.containsKey(c)) { s2stat.put(c, 1); }
                else s2stat.put(c, s2stat.get(c) + 1);
            }
            
            int excess = 0;
            //System.out.println("Before opt: " +  s1stat + " ||| " + s2stat);
            // remove those which are the same already
            Iterator it = s1stat.entrySet().iterator();
            while(it.hasNext()) {
                Map.Entry<Character, Integer> entry = (Map.Entry)it.next();
                Character key = entry.getKey();
                                
                if(s2stat.containsKey(key)) {
                   if(s2stat.get(key).equals(entry.getValue())) {
                       //System.out.println("Perfect match for " + key + ": " + entry.getValue());
                       s2stat.remove(key);
                       it.remove();
                       // character is perfectly balanced
                       continue;
                   }
                   int diff = entry.getValue() - s2stat.get(key);
                    if(diff > 0) {
                      //  System.out.println("Summing diff of " + key + ": " + diff);
                        answer += diff;
                    }

                }
                else {
                    // all appearances of this character should be replaced
                    //System.out.println("Summing total num of " + key + ": " + entry.getValue());

                    answer += entry.getValue();
                    it.remove();
                    continue;
                }
            }
            
            //System.out.println("After opt: " +  s1stat + " ||| " + s2stat);
            
            System.out.println(answer);
                       
        }
        in.close();
    }
}