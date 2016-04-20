import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int tmp = ar[ar.length - 1];
        ar[ar.length - 1] = ar[ar.length - 2];
        
        for(int i = ar.length - 2; i >= -1; i--) {
            //System.out.println("At index: " + i);
            //System.out.println("Comparing " + ar[i] + " to " + tmp);
            if(i == -1) { ar[0] = tmp; break; }
            if(ar[i] > tmp) {
                //System.out.printf("Shifting %d [%d] to %d [%d]\n", i, ar[i], i+1, ar[i+1]);
                ar[i + 1] = ar[i];
                //if(i == 0) ar[i] = tmp;
            }
            else {
                ar[i + 1] = tmp;
                break;
            }
            printArray(ar);
        }
        printArray(ar);
        
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
