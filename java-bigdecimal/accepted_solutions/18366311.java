import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        //String []s=new String[n+2];
        LinkedList<String> s = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            s.add(sc.next().trim());
        }

        Collections.sort(s, new Comparator<String>(){
            public int compare(String a, String b){
                int x = new BigDecimal(a).compareTo(new BigDecimal(b));
                return (x==0) ? 1 : -x;
            }
        });
        
        //Output
        for(String d: s) {
            System.out.println(d);
        }

    }


}
