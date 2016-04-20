import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        SimpleDateFormat dpar = new SimpleDateFormat("hh:mm:ssa");
        Date res = null;
        try{
            res = dpar.parse(time);
        }
        catch (Exception e){ e.printStackTrace(); }
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(res));
    }
}
