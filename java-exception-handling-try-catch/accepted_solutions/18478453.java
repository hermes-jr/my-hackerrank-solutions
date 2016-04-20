import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        try {
            n1 = in.nextInt();
            n2 = in.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println(e.getClass().getCanonicalName());
            System.exit(0);
        }
        try{
            System.out.println(n1/n2);
            
        }
        catch(Exception e) {
            System.out.println(e.getClass().getCanonicalName() + ": " + e.getMessage());
        }
    }
}