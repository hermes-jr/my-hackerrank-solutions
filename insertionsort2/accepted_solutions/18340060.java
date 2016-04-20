import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
           /*
           for i ← 1 to length(A) - 1
    j ← i
    while j > 0 and A[j-1] > A[j]
        swap A[j] and A[j-1]
        j ← j - 1
    end while
end for
*/
        
        for(int i = 1; i < ar.length; i ++) {
            for(int j = i; j > 0 && ar[j - 1] > ar[j]; j--) {
                int tmp = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = tmp;
                //System.out.println("Swapping values");
            }
            printArray(ar);
        }
        
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
