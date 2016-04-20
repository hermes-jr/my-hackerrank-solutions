//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Map<String, Integer> pb = new TreeMap<>();
      Scanner in = new Scanner(System.in);
      int n=Integer.parseInt(in.nextLine().trim());
      for(int i=0;i<n;i++)
      {
         pb.put(in.nextLine().trim(), Integer.parseInt(in.nextLine().trim()));
      }
       
      while(in.hasNext())
      {
         String s=in.nextLine().trim();
          if(!pb.containsKey(s)) {
              System.out.println("Not found");
              continue;
          } 
          System.out.println(s + "=" + pb.get(s));
           
      }
   }
}
