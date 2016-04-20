import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static void printAnswer(boolean isWin) {
        System.out.println(isWin ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine().trim());
        for(int c_i = 0; c_i < cases; c_i++) {
            String[] cOpts = in.nextLine()
                                .trim()
                                .split("\\s+");

            int elements = Integer.parseInt(cOpts[0]);
            int maxJump = Integer.parseInt(cOpts[1]);
            
            //System.out.println("el: " + elements + " mj : " + maxJump);
            
            // Possible instant win
            if(maxJump >= elements || elements < 2) {
                printAnswer(true);
                in.nextLine(); // dump array data
                continue;
            }
            
            ArrayList<Byte> data = new ArrayList<>();
            
            for(int d_i = 0; d_i < elements; d_i++) {
                data.add(in.nextByte());
            }
            if(in.hasNextLine()) in.nextLine(); // dump newline
            
            //System.out.println(data);
            
            // Possible instant fail
            boolean instantFail = (maxJump == 0) ? false : true;
            for(int if_i = elements - maxJump; if_i < elements; if_i++ ) {
                // System.out.println(data + " testing : " + if_i  + " dat " + data.get(if_i));
                if(if_i >= 0 && data.get(if_i).equals((byte)0)) {
                    instantFail = false;
                    break;
                }
            }
            if(instantFail) { printAnswer(false); continue; }
            
            // Now stop being a smart ass and dig path (forward or back?)
            HashSet<Integer> visited = new HashSet<>();
            visited.add(0);
            Queue<Integer> currentOptions = new LinkedList<>();
            if(data.get(1).equals((byte)0)) currentOptions.add(1);
            if(data.get(maxJump).equals((byte)0)) currentOptions.add(maxJump);
            
            //System.out.println(data + " mj: " + maxJump);
            printAnswer(dig(data, currentOptions, visited, elements, maxJump));
        }

    }
    
    private static boolean dig(ArrayList<Byte> data, Queue<Integer> currentOptions, HashSet<Integer> visited, int elements, int maxJump) {
        if(currentOptions.isEmpty()) return false; // No more options and we still didn't get to finish
        
        while(!currentOptions.isEmpty()) {
            //System.out.println("Options: " + currentOptions);
            Integer option = currentOptions.remove();
            
            //System.out.println("Inspecting index " + option + " visited: " + visited + " q: " + currentOptions);
            
            /*
            if(option.compareTo(elements) >= 0) {
                return true; // We finished somehow
            }
            */
            
            if(!visited.contains(option)) {
                int v1 = option + 1;
                int v2 = option - 1;
                int v3 = option + maxJump;
                
                //System.out.printf("Possible jumps: %d %d %d \n", v1, v2, v3);
                
                if(v1 >= elements || v2 >= elements || v3 >= elements) return true; // We will get to finish at next step
                
                //System.out.printf("Datas: %d %d %d \n", data.get(v1), data.get(v2), data.get(v3));

                if(!visited.contains(v1) && data.get(v1).equals((byte)0)) {
                    currentOptions.add(v1);
                    //System.out.printf("Adding next step: %d val %d \n", v1, data.get(v1));
                }
                if(!visited.contains(v2) && data.get(v2).equals((byte)0)) {
                    currentOptions.add(v2);
                    //System.out.printf("Adding next step: %d val %d \n", v2, data.get(v2));
                }
                if(!visited.contains(v3) && data.get(v3).equals((byte)0)) {
                    currentOptions.add(v3);
                    //System.out.printf("Adding next step: %d val %d \n", v3, data.get(v3));
                }

                visited.add(option);
            }
        }
        return dig(data, currentOptions, visited, elements, maxJump);
        //return false;
    }
}