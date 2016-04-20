import java.util.*;
public class Solution {
       
          static void partition(int[] ar) {
           int pivot = ar[0];
           List<Integer> left = new LinkedList<>();
           List<Integer> equal = new LinkedList<>();
           List<Integer> right = new LinkedList<>();
              
           for(int i = 0; i < ar.length; i++) {
               int el = ar[i];
               if(el == pivot) equal.add(el);
               else if(el < pivot) left.add(el);
               else right.add(el);
           }
              
           print(left);
           print(equal);
           print(right);
       }   
    
   static void print(List<Integer> list) {
       for(Integer el: list) { System.out.print(el + " "); }
   }
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
