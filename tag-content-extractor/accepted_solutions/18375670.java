import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      
      //Pattern r = Pattern.compile("<(\\p{Print}+?)[^>]*+>([^<]*?)<\\/\\1>");
      //Pattern r = Pattern.compile("(?<=\\<(\\p{Print}{1,350}))?>(.*?)(?=\\</\\1>)");
      Pattern r = Pattern.compile("<(\\p{Print}{1,300})[^>]*+>([^<]*?)(?=<\\/\\1>)");
      
      Matcher m = r.matcher("");
       
      int testCases = Integer.parseInt(in.nextLine());
       
      while(testCases-- > 0){
          String line = in.nextLine();
          //System.out.println("\nInspecting: " + line );
          
          List<String> results = new LinkedList<String>();
          
          if(line.indexOf("</") >-1) {
              
          m.reset(line);
          
          while (m.find()) {
             String found = m.group(2);
             String cleaned = (found.indexOf(">") > -1) ? found.substring(found.lastIndexOf(">") + 1, found.length()) : found;
             if(!cleaned.isEmpty()) {
                 
                results.add(cleaned);              

             }
          }
          }
          
          if(results.isEmpty()) {
              System.out.println("None");
              continue;
          }
          
          //System.out.println("Results: " +  results);
          
          for(String z: results) {
              System.out.println(z);
          }
          
       }
       in.close();
   }
}
