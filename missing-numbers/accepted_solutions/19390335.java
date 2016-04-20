import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Set<Integer> uniqs = new HashSet<>(); // dumb solution
        
        int n = in.nextInt();
        while(n-- > 0) {
            int next = in.nextInt();
            if(map1.containsKey(next)) {
                map1.put(next, map1.get(next) + 1);
            }
            else {
                map1.put(next, 1);
                uniqs.add(next);
            }
        }
       
        n = in.nextInt();
        while(n-- > 0) {
            int next = in.nextInt();
            if(map2.containsKey(next)) {
                map2.put(next, map2.get(next) + 1);
            }
            else {
                map2.put(next, 1);
                uniqs.add(next);
            }
        }
        
        List<Integer> sl = new ArrayList<>();
        sl.addAll(uniqs);
        Collections.sort(sl);

        //System.out.println(map1);
        //System.out.println(map2);
        
        for(Integer un: sl) {
            if(map1.containsKey(un) && map2.containsKey(un) && map1.get(un).equals(map2.get(un))) continue; 
            System.out.print(un + " ");
        }
        
    }
}