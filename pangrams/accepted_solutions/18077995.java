import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String testMe = in.nextLine();
        HashSet<String> letters = new HashSet<String>();
        for(String letter: testMe.split("")) {
            if(!letter.isEmpty() && Character.isAlphabetic(letter.charAt(0))) {
                letters.add(letter.toLowerCase());
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