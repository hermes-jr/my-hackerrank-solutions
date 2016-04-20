    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            TreeMap<Integer, Integer> q = new TreeMap<>();
            Deque<Integer> deque = new ArrayDeque<>();
        
            int n = in.nextInt();
            int m = in.nextInt();
            int maxun = -1;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                
                if(i < m - 1) {
                    
                    // Skip calculations until necessary
                    deque.add(num);
                    
                    if(q.containsKey(num)) {
                        q.put(num, q.get(num) + 1);
                    } else {
                       q.put(num, 1);
                    }
                
                    continue;
                }
                
                deque.add(num);

                if(q.containsKey(num)) {
                   q.put(num, q.get(num) + 1);
                } else {
                   q.put(num, 1);
                }
                //System.out.println("Deque: " + deque);

                if(maxun == -1) {
                   //System.out.println("Uniqs: " + uns + " map: " + q);
                   maxun = q.size();
                }
                
                //System.out.println("Deque: " + deque);
                //System.out.println("Tree: " + q);
                //System.out.println("Size: " + q.size());
                maxun = Math.max(q.size(), maxun);
                
                int remme = deque.removeFirst();
                if(q.get(remme) == 1) {
                    q.remove(remme);
                } else {
                    q.put(remme, q.get(remme) - 1);
                }
                //maxun = Math.max(q.size(), maxun);
            }
            System.out.println(maxun);
        }
    }
