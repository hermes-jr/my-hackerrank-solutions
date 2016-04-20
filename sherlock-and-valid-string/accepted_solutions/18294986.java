import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        
        String s1 = in.nextLine().trim().toLowerCase();
        
        // Instant win
        if(s1.length() <= 4) { System.out.println("YES"); System.exit(0); }
 
        Map<Character,Integer> stat = new HashMap<>();
            
       // calculate freqs
       for(Character c: s1.toCharArray()) {
          if(!stat.containsKey(c)) { stat.put(c, 1); }
          else stat.put(c, stat.get(c) + 1);
       }
        
       //System.out.println(stat);
        
       ArrayList<Integer> nums = new ArrayList<>();
       
       Iterator it = stat.entrySet().iterator();
       while(it.hasNext()) {
           Map.Entry<Character, Integer> entry = (Map.Entry)it.next();
           //Character key = entry.getKey();
           nums.add(entry.getValue());
       }
        
        nums.trimToSize();
        Collections.sort(nums);
        
        if(nums.get(0).equals(nums.get(nums.size() - 1))) {
            System.out.println("YES"); System.exit(0); // Instant win, all elements are the same
        }
        
        Double median = 0.0;
        int middle = nums.size()/2;
        if (nums.size() % 2 == 1) {
            median = (double) nums.get(middle);
          } else {
            median = (nums.get(middle-1) + nums.get(middle) ) / 2.0;
         }
        
        //System.out.println("Median: " + median);
        //System.out.println("Nums: " + nums);
        
        if(!median.equals(Math.floor(median))) {
            //System.out.println("Median not int: " + median);
            System.out.println("NO");
            System.exit(0);
        }
        else {
            int count = 0;
            for (ListIterator iterator = nums.listIterator(nums.size()); iterator.hasPrevious();) {
                final Integer elem = (Integer)iterator.previous();
                if(median.compareTo(elem.doubleValue()) != 0) {
                    count++;
                    if(count > 1) { System.out.println("NO"); System.exit(0); }
                }
            }
            count = 0;
            for (Iterator iterator = nums.iterator(); iterator.hasNext();) {
                final Integer elem = (Integer)iterator.next();
                if(median.compareTo(elem.doubleValue()) < 0) {
                    count++;
                    if(count > 1) { System.out.println("NO"); System.exit(0); }
                }
            }
            System.out.println("YES"); System.exit(0);
        }
            
        in.close();
    }
}