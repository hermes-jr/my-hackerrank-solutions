import java.util.*;
public class Solution {

/*
    algorithm quicksort(A, lo, hi) is
    if lo < hi then
        p := partition(A, lo, hi)
        quicksort(A, lo, p – 1)
        quicksort(A, p + 1, hi)

algorithm partition(A, lo, hi) is
    pivot := A[hi]
    i := lo        // place for swapping
    for j := lo to hi – 1 do
        if A[j] ≤ pivot then
            swap A[i] with A[j]
            i := i + 1
    swap A[i] with A[hi]
    return i
*/
    static int partition(int[] ar, int lo, int hi) {
        int pivot = ar[hi];
        int i = lo;
        for(int j = lo; j <= hi - 1; j++) {
            if(ar[j] <= pivot) {
                int tmp = ar[i];
                ar[i] = ar[j];
                ar[j] = tmp;
                i++;
            }
        }
        int tmp = ar[i];
        ar[i] = ar[hi];
        ar[hi] = tmp;
        return i;
    }

    static void quickSort(int[] ar, int lo, int hi) {
        if(lo < hi) {
            int p = partition(ar, lo, hi);
            
            for(int i = 0; i < ar.length; i++) {
               System.out.print(ar[i] + " ");            
            }
            System.out.println();
            
            quickSort(ar, lo, p - 1);
            quickSort(ar, p + 1, hi);
        }

        // result:
        /*
        if(ar.length > 0 && lo < hi) {
            for(int i = lo; i <= hi; i++) {
               System.out.print(ar[i] + " ");            
            }
            System.out.println();
        }*/

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
           quickSort(ar, 0, ar.length - 1);
       }    
   }
