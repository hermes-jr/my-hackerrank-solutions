import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static boolean isPair(char[] s1, char[] s2) {
        Map<Character, Integer> ul1 = new TreeMap<>();
        Map<Character, Integer> ul2 = new TreeMap<>();
        for(Character c: s1) {
            if(ul1.containsKey(c)) ul1.put(c, ul1.get(c) + 1);
            else ul1.put(c, 1);
        }
        for(Character c: s2) {
            if(ul2.containsKey(c)) ul2.put(c, ul2.get(c) + 1);
            else ul2.put(c, 1);
        }
        //System.out.println(ul1 + " || " + ul2);
        
        return ul1.equals(ul2);
    }
    private static void parse(String line) {
        //System.out.println("Processing: " + line);
        
        char[] arr = line.toCharArray();
        int answer = 0;
        
        // instant fail test
        /*
        Map<Character, Integer> ul = new HashMap<>();
        for(Character c: line.toCharArray()) {
            if(ul.containsKey(c)) ul.put(c, ul.get(c) + 1);
            else ul.put(c, 1);
        }
        for(Iterator it = ul.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Character, Integer> item = (Map.Entry<Character, Integer>)it.next();
            if(item.getValue().equals(1)) it.remove();
        }
        if(ul.isEmpty()) { System.out.println("0"); return; }
        */

        // precise test
        for (int len = 1; len < arr.length; len++) {
            char chn1[] = new char[len];
            for (int i = 0; i < arr.length - len; i++) {
                System.arraycopy(arr, i, chn1, 0, len);
                
                char chn2[] = new char[len];
                for (int j = i + 1; j < arr.length - len + 1; j++) {
                    System.arraycopy(arr, j, chn2, 0, len);
                    //System.out.println("Comparing: " + Arrays.toString(chn1) + " || " + Arrays.toString(chn2));
                    //System.out.println(isPair(chn1, chn2));
                    if(isPair(chn1, chn2)) answer++;
                }
            }
        }
        
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int cases = Integer.parseInt(in.nextLine().trim());
        
        for(int c_i = 0; c_i < cases; c_i++) {
            parse(in.nextLine().trim());
        }
        
        in.close();
    }
}