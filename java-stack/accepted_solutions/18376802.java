import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
       Map<String, String> braces = new HashMap<>();
       braces.put("{", "}");
       braces.put("(", ")");
       braces.put("[", "]");

       cases:
      while (sc.hasNextLine()) {
                Deque<String> stack = new ArrayDeque<String>();

         String input=sc.nextLine().trim();
          if(input.isEmpty()) { System.out.println("true"); continue cases; }
         // System.out.println("\n Next case: " + input);
          
         for(String item : input.split("")) {
           //  System.out.println("Inspecting item: " + item);
             if(braces.containsKey(item)) {
                 stack.push(item);
             //    System.out.println("Pushing " + item + " stack is: " + stack);
             }
             else if(braces.containsValue(item)){
                 // try to peek
                 //System.out.println("Stack peek is: " + stack.peek());
                 if(item.equals(braces.get(stack.peek()))) {
                     stack.pop(); // matching closing bracket
           //          System.out.println("Popping, symmetry " + stack);
                 } else
                 {
                     System.out.println("false"); // non-matching closing bracket
                     continue cases;
                 }
             }
         }
          
          if(stack.isEmpty()) System.out.println("true"); // out of input and no items left
          else System.out.println("false"); // out of input, but items left
            //Complete the code
      }
      
   }
}
