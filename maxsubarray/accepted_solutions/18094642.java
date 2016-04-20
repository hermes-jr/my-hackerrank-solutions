import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int c_i = 0; c_i < cases; c_i++) {
            int caseLen = in.nextInt();
            ArrayList<Integer> caseData = new ArrayList<Integer>();

            for(int c_j = 0; c_j < caseLen; c_j++) {
                caseData.add(in.nextInt());
            }
            //System.out.println("Data read: " + caseData);
            System.out.println(maxCont(caseData) + " " + maxNoCont(caseData));
        }
    }

    private static long sumMe(ArrayList<Integer> data) {
        long sum = 0;
        for (Integer i:data) {
            sum += i;
        }
        return sum;
    }

    private static long recur(ArrayList<Integer> target) {
        int size = target.size();
        long leftMss, rightMss;
        //System.out.println("Analyzing: " + target);

        if(size == 1) { return target.get(0); }

        ArrayList<Integer> ll = new ArrayList<Integer>(target.subList(0, size / 2));
        ArrayList<Integer> rl = new ArrayList<Integer>(target.subList(size / 2, target.size()));
        leftMss = recur(ll);
        rightMss = recur(rl);

        long mrs = rl.get(0);
        long crs = 0L;
        for(Integer i: rl) {
            crs += i;
            if(crs > mrs) { mrs = crs; }
        }

        Collections.reverse(ll);
		long mls = ll.get(0);
        long cls = 0L;
        for(Integer i: ll) {
            cls += i;
            if(cls > mls) { mls = cls; }
        }
        long midS = mls + mrs;

        //System.out.println(leftMss + " <=> " + rightMss + " <=> " + midS);
        return Math.max(leftMss, Math.max(rightMss, midS));
    }

    private static long maxCont(ArrayList<Integer> data) {
        return recur(data);
    }

    private static long maxNoCont(ArrayList<Integer> data) {
        Collections.sort(data);
        //System.out.println(data);
        long sum = data.get(data.size() - 1);

		if(sum < 0) return sum;

		sum = 0;
		for(Integer i: data)
		{
			if(i > 0) sum += i;
		}
		return sum;
	}
}