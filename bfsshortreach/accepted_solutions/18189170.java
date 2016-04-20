import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer cases = in.nextInt();
		//System.out.println("Cases: " + cases);

        for (int c_i = 0; c_i < cases; c_i++) {
			//System.out.println("Case: " + (c_i + 1));

			HashMap<Integer,Long> paths = new HashMap<>();
            Integer nodes = in.nextInt();
            Integer edges = in.nextInt();
            // Filled with nulls by default. Nothing is connected
            Integer[][] graph = new Integer[nodes][nodes];

            // Scan and fill in connectivity data
            for (int e_i = 0; e_i < edges; e_i++) {
                Integer nd1 = in.nextInt() - 1;
                Integer nd2 = in.nextInt() - 1;
				//System.out.println("Connectivity: " + nd1 + " to " + nd2);
                graph[nd1][nd2] = 6;
                graph[nd2][nd1] = 6;
            }

			Integer start = in.nextInt() - 1;
			//System.out.println("Node in question: " + start);

			// Fill path info to other nodes with infinity (null)
			for(int p_i = 0; p_i < nodes; p_i++) {
				Long w = null;
				if (p_i == start) w = 0L;
				paths.put(p_i, w);
			}

			ArrayList<Integer> visited = new ArrayList<>();
			Queue<Integer> queue = new LinkedList();
			queue.add(start);
			visited.add(start);
			paths.put(start, 0L);
			while(!queue.isEmpty()) {
				Integer cnode = queue.remove();

				Integer crutch = 0;
				for(Integer t_c: graph[cnode]) {
					if(t_c != null && !visited.contains(crutch) && !crutch.equals(cnode)) {
						visited.add(crutch);
						queue.add(crutch);
						Long cpath = paths.get(crutch);
						cpath = paths.get(cnode) + 6L;
						paths.put(crutch, cpath);

					}
					crutch++;
				}
			}

			//System.out.println(visited);
			//System.out.println(paths);

			for(int p_i = 0; p_i < nodes; p_i++) {
				if(p_i == start) { continue; }
				Long cpath = paths.get(p_i);
				if(cpath == null) {
					System.out.print("-1 ");
				}
				else {
					System.out.print(cpath + " ");
				}
			}
			System.out.println("");

			//System.out.println("NEXT CASE");
        }
    }
}