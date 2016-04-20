import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      ArrayList<Character> letters1 = new ArrayList<>();
      ArrayList<Character> letters2 = new ArrayList<>();
      for(Character z : A.toLowerCase().toCharArray()) { letters1.add(z); }
      for(Character z : B.toLowerCase().toCharArray()) { letters2.add(z); }
       //System.out.println(letters1);
       //System.out.println(letters2);
       Collections.sort(letters1);
       Collections.sort(letters2);
       return letters1.equals(letters2);
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
