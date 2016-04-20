import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

  private static final String[] words = {
    "",
    "one", "two", "three",
    "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven", "twelve", "thirteen", "fourteen", "fifteen",
    "sixteen", "seventeen", "eighteen", "nineteen",
    "twenty", "twenty one", "twenty two",
    "twenty three", "twenty four", "twenty five",
    "twenty six","twenty seven","twenty eight", "twenty nine"
  };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        String time = "";
        String plu;
        
        plu = (m == 1 || m == 59) ? "minute" : "minutes";
        
        int a = (h == 12) ? 1 : h + 1;
        
         if(m==0)
            time = words[h] + " o' clock";
         else if(m==15)
            time = "quarter past " + words[h];
         else if(m==30)
            time = "half past " + words[h];
         else if(m==45)
            time = "quarter to " + words[a];
         else if(m<30) // minutes 1-29
            time = words[m] + " " + plu + " past " + words[h];
         else // minutes 31-59
            time = words[60 - m] + " " + plu + " to " + words[a];
             
        System.out.println(time);
    }
}
