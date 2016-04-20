import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> subs = new ArrayList<>();
        String str = in.nextLine();
        int k = in.nextInt();
        for(int offs = 0; offs < str.length() - k + 1; offs++) {
            //System.out.println(str.substring(offs, offs + k));
            subs.add(str.substring(offs, offs + k));
        }
        Collections.sort(subs);
        System.out.println(subs.get(0));
        System.out.println(subs.get(subs.size() - 1));
    }
}