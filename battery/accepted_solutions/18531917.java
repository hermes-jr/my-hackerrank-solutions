import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;


public class Solution {

   private static Scanner in;
   
   public static void main(String[] args) {
      
      in = new Scanner(System.in);
      double timp_incarcare = in.nextDouble();
      //System.out.println(timp_incarcare);
       
      /* according to input data, time is 8.0 after 4 hours
        and time is linear about 2*x for x hours under 4
      */
       
       if(timp_incarcare >= 4.0) {
           System.out.println(8.0);
       } else
       {
           System.out.println(2.0 * timp_incarcare);
       }

   }

}
