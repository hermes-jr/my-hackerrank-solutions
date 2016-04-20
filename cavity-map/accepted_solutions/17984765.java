import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer grid[][] = new Integer[n][n];
        String result[][] = new String[n][n];
        for(int grid_i=0; grid_i < n; grid_i++){
            // For some reason split() returns first element empty, so... 1 to n+1
            String[] tm = Arrays.copyOfRange(in.next().split(""), 1, n + 1);
            result[grid_i] = tm;
            for(int grid_j=0; grid_j < n; grid_j++) {
                grid[grid_i][grid_j] = Integer.parseInt(tm[grid_j]);

            }
            
        }
        
        for(int grid_i=1; grid_i < n - 1; grid_i++) {
            for(int grid_j=1; grid_j < n - 1; grid_j++) {
                ArrayList<Integer> neighbours = new ArrayList<Integer>();
//                neighbours.add(grid[grid_i - 1][grid_j - 1]); // oops, wrong interpretation of neighbour =)
                neighbours.add(grid[grid_i - 1][grid_j]);
//                neighbours.add(grid[grid_i - 1][grid_j + 1]);
                neighbours.add(grid[grid_i][grid_j - 1]);
                neighbours.add(grid[grid_i][grid_j + 1]);
//                neighbours.add(grid[grid_i + 1][grid_j - 1]);
                neighbours.add(grid[grid_i + 1][grid_j]);
//                neighbours.add(grid[grid_i + 1][grid_j + 1]);
                Collections.sort(neighbours);
                // if current cell value is greater then the largest neighbour
                if(grid[grid_i][grid_j].compareTo(neighbours.get(neighbours.size() - 1)) == 1) {
                    result[grid_i][grid_j] = "X";
                }
            }
        }

        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < n; grid_j++){
                System.out.print(result[grid_i][grid_j]);
            }
            System.out.println("");
        }
    }
}
