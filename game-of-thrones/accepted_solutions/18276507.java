import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine().trim();
        myScan.close();
        
        // Instant answer
        if(inputString.length() == 1) { System.out.println("YES"); System.exit(0); }
       
        boolean ans = true;
        
        HashMap<Character, Integer> usedLetters = new HashMap<>();
        for(Character c: inputString.toCharArray()) {
            if(usedLetters.containsKey(c)) {
                usedLetters.put(c, usedLetters.get(c) + 1);
            }
            else {            
                usedLetters.put(c, 1);
            }
        }
        
        //System.out.println(usedLetters);
        
        int odds = 0;
        // String may be palindrome only if there are less then 1 odd-times appearing characters
       
        Iterator it = usedLetters.entrySet().iterator();
        while (it.hasNext()) {
            Integer cv = ((Map.Entry<Character, Integer>)it.next()).getValue();
            it.remove(); // avoids a ConcurrentModificationException
            if(cv % 2 != 0) { odds++; }
            if(odds > 1) {
                ans = false;
                break;
            }
        }
        
        System.out.println(ans ? "YES" : "NO");
        
    }
}
