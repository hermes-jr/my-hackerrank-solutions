import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Pair implements Comparable<Pair>
{
	public String a;
	public String b;
    
    public Pair(String a, String b) {
        this.a = a;
        this.b = b;
    }
    
    public int compareTo(Pair o) {
        if (o == this) {
            return 0;
        }
        
        /*
        if (o instanceof Pair) {
            // System.out.println("Checking for equality");
            if(((Pair) o).a.equals(this.a) && ((Pair) o).b.equals(this.b)) return 0;
        }*/
            
        return (o.a + "-" + o.b).compareTo(this.a + "-" + this.b);
    }
    
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Pair> data = new TreeSet<>();
        int cases = Integer.parseInt(in.nextLine().trim());
        
        for(int c_i = 0; c_i < cases; c_i++) {
            String[] pd = in.nextLine().split("\\s+");
            //System.out.printf("%s - %s\n", pd[0], pd[1]);
            data.add(new Pair(pd[0], pd[1]));
            System.out.println(data.size());
        }
        in.close();
    }
}