import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.nextLine().trim());
        BigInteger b = new BigInteger(in.nextLine().trim());
        in.close();

        System.out.println(a.add(b).toString());
        
        System.out.println(a.multiply(b).toString());
    }
}