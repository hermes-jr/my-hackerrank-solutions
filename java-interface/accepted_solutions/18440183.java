
class MyCalculator implements AdvancedArithmetic {
    private List<Integer> getDivisors(int n) {
        List<Integer> dlist = new LinkedList<>();
        int root = (int)Math.sqrt(n);
        
        //System.out.println("Root: " + root);
        
        for(int c_i = 1; c_i < root + 1; c_i++) {
            if(n % c_i == 0) {
                dlist.add(c_i);
                dlist.add(n / c_i);
            }
        }

        //System.out.println(dlist);
        
        return dlist;
    }
    public int divisorSum(int n) {
        int sum = 0;
        
        if(n == 1) { return 1; }
        
        if((new java.math.BigInteger(n + "")).isProbablePrime(1)) {
            return n + 1;
        }
        
        for(Integer z: getDivisors(n)) {
            sum += z;
        }
        return sum;
    }
}