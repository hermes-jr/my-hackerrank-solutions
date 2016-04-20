import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        int curPage = 1;
        
        int chapters = in.nextInt();
        int maxProbs = in.nextInt();
        for(int c_i = 0; c_i < chapters; c_i++) {
            int curChapterProbs = in.nextInt();
            for(int p_i = 1; p_i <= curChapterProbs; p_i++) {
                //System.out.printf("Analyzing problem %d, current page is %d\n", p_i, curPage);
                if(p_i == curPage) {
                    answer++;
                    //System.out.println("Found a match, answer is: " + answer);
                }
                if(p_i % maxProbs == 0 && p_i != curChapterProbs) { curPage++; }
            }
            curPage++; // end of chapter
        }
        System.out.println(answer);
    }
}