import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int cases = Integer.parseInt(in.nextLine().trim());
        
        HashMap<Character, Integer> letters = new HashMap<>();
        for(int z = 0; z++ < cases;) { 
            String line = in.nextLine()
                .trim()
                .toLowerCase();
            
            HashSet<Character> curUniques = new HashSet<>();
            for(Character chr: line.toCharArray()) {
                curUniques.add(chr);
            }
            for(Character chr: curUniques) {
                if(letters.containsKey(chr)) { letters.put(chr, letters.get(chr) + 1); }
                else { letters.put(chr, 1); }
            }
        }
        in.close();
        
        int answer = 0;
        for(Map.Entry<Character, Integer> letterCount: letters.entrySet()) {
            if(letterCount.getValue().equals(cases)) { answer++; }
        }
        
        System.out.println(answer);
    }
}