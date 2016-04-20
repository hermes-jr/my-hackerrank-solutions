import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String testMe = in.nextLine();
        HashSet<Character> letters = new HashSet<Character>();
        for(Character letter: testMe.toCharArray()) {
            if(Character.isLetter(letter)) {
                letters.add(Character.toLowerCase(letter));
            }
        }
        if(letters.size() == 26) {
            System.out.println("pangram");
        }
        else {        
            System.out.println("not pangram");
        }
    }
}