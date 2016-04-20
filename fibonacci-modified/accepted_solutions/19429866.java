import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger a = BigInteger.valueOf(in.nextInt());
        BigInteger b = BigInteger.valueOf(in.nextInt());
        int n = in.nextInt();
        
        BigInteger next = BigInteger.valueOf(0);
        for(int i = 3; i <= n; i++) {
            next = b.multiply(b).add(a);
            //System.out.printf("a=%d b=%d next=%d step=%d\n", a, b, next, i);
            a = b;
            b = next;
        }
        System.out.println(next.toString());
    }
}