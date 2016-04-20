import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder(str);
        return rev.reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        
        for(int c_i = 0; c_i < cases; c_i++) {
            int answer = 0;
            String line = in.nextLine().trim();
            
            if(isPalindrome(line)) {
                answer = -1;
            }
            else if(line.length() == 2) {
                // Probably unnecessary
                answer = 0;
            }
            else {
                // Bruteforce solution
                /*
                for(int rm = 0; rm < line.length(); rm++) {
                    StringBuilder mis = new StringBuilder(line);
                    mis.replace(rm, rm + 1, "");
                    //System.out.println("Testing: " + mis.toString());
                    if(isPalindrome(mis.toString())) {
                        answer = rm;
                        break;
                    }
                }*/
                
                // 1-pass solution
                char[] letters = line.toCharArray();
                //System.out.println(Arrays.toString(letters));
                
                for(int mir = 0; mir <= letters.length / 2; mir++) {
                    int endpos = letters.length - mir - 1;
                    //System.out.printf("Mir: %d , endpos: %d\n", mir, endpos);
                    
                    if(letters[mir] == letters[endpos]) {
                        // still a palindrome
                        //System.out.printf("Comparing %s %s\n", letters[mir], letters[endpos]);
                        continue;
                    }
                    else {
                        // find out which is incorrect, left or right
                        if(letters[mir + 1] == letters[endpos]) {
                            // doublecheck
                            StringBuilder mis = new StringBuilder(line);
                            mis.replace(mir, mir + 1, "");
                            if(isPalindrome(mis.toString())) {
                                answer = mir;
                                break;                        
                            }
                        }
                        if(letters[mir] == letters[endpos - 1]) {
                            // doublecheck
                            StringBuilder mis = new StringBuilder(line);
                            mis.replace(endpos, endpos + 1, "");
                            if(isPalindrome(mis.toString())) {
                                answer = endpos;
                                break;                        
                            }
                        }
                    }
                }
                     
            }
            
            System.out.println(answer);
        }
        
        in.close();
    }
}
