import java.util.*;
public class Solution {
       
       static List<Integer> quickSort(List<Integer> ar) {
           //System.out.println("Sorting " + ar);
           
           if(ar.size() < 2) return ar;
           
           List<Integer> left = new LinkedList<>();
           List<Integer> right = new LinkedList<>();
           List<Integer> equal = new LinkedList<>();

           Integer pivot = ar.get(0);
           for(Integer el: ar) {
               if(el.compareTo(pivot) < 0) left.add(el);
               else if(el.compareTo(pivot) > 0) right.add(el);
               else equal.add(el);
           }
           
           //System.out.println("Left: " + left);
           //System.out.println("Equals: " + equal);
           //System.out.println("Right: " + right);

           List<Integer> result = new LinkedList<>();
           
           result.addAll(quickSort(left));
           result.addAll(quickSort(equal));
           result.addAll(quickSort(right));
           
           for(Integer z: result) System.out.print(z + " ");
           System.out.println();
           
           //System.out.println("Result: " + result);

           
           return result;
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
           LinkedList<Integer> ar = new LinkedList<>();
           for(int i=0;i<n;i++){
              ar.add(in.nextInt()); 
           }
           quickSort(ar);
          
           
       }    
   }
