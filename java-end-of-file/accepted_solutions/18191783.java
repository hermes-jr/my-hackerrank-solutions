import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iter = 0;
        while(in.hasNextLine()) {
            System.out.println(++iter + " " + in.nextLine());
        }
    }
}