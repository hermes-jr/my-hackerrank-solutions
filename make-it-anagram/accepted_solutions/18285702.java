import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static HashMap<Character, Integer> countLetters(String line) {
        HashMap<Character, Integer> letCount = new HashMap<>();
        // Get a set of each character appearing at least once in current string
        for(Character chr: line.toCharArray()) {
                if(letCount.containsKey(chr)) { letCount.put(chr, letCount.get(chr) + 1); }
                else { letCount.put(chr, 1); }
            }
        return letCount;
    }
    private static long unifyMaps(HashMap<Character, Integer> m1, HashMap<Character, Integer> m2) {
        long res = 0;

        Iterator it = m1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> cc = (Map.Entry<Character, Integer>)it.next();
            if(!m2.containsKey(cc.getKey())) {
                //System.out.println("removing [" + cc.getKey() + "] from map 1");
                res += cc.getValue();
                it.remove();
            }
        }

        it = m2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> cc = (Map.Entry<Character, Integer>)it.next();
            if(!m1.containsKey(cc.getKey())) {
                //System.out.println("removing [" + cc.getKey() + "] from map 2");
                res += cc.getValue();
                it.remove();
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        HashMap<Character, Integer> letCount1 = new HashMap<>();
        HashMap<Character, Integer> letCount2 = new HashMap<>();
        long answer = 0;        
        
        String line1 = in.nextLine()
                .trim()
                .toLowerCase();
        String line2 = in.nextLine()
                .trim()
                .toLowerCase();
        
        in.close();
            
        letCount1 = countLetters(line1);
        letCount2= countLetters(line2);

        //System.out.println(letCount1 + " <->" + letCount2);
        
        long unify = unifyMaps(letCount1, letCount2);
        answer += unify;
        
        if(!letCount1.isEmpty() && !letCount2.isEmpty()) {
            Iterator it = letCount1.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Character, Integer> cc1 = (Map.Entry<Character, Integer>)it.next();
                Integer a = cc1.getValue();
                Integer b = letCount2.get(cc1.getKey());
                //System.out.printf("Difference between maps: %s, a=%d, b=%d, moddif=%d\n", cc1.getKey(), a, b, Math.abs(a - b));
                answer += Math.abs(a - b);
            }
        }
        
        //System.out.println(letCount1 + " <->" + letCount2);
        
        System.out.println(answer);
    }
}