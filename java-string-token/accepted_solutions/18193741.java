    import java.io.*;
    import java.util.*;



    public class Solution {

      
        public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine().trim();
        //Complete the code
          s = s.replaceAll("[^A-Za-z ]", " ");
          if(s.length() > 0) {
              String[] result = s.split("\\s+");
              System.out.println(result.length);
                for (int x=0; x<result.length; x++) {         
                    System.out.println(result[x]);
                }
          }
            else {
                System.out.println("0");
            }
        }
    }
