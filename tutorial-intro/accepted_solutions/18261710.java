import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer target = Integer.parseInt(in.nextLine().trim());
        int len = Integer.parseInt(in.nextLine().trim());
        LinkedList<Integer> items = new LinkedList<>();
        for(int i = 0; i < len; i++) {
            items.add(in.nextInt());
        }
        System.out.println(items.indexOf(target));
    }
}