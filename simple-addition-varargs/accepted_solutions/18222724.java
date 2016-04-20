
class Add {
    public void add(int... arr) {
        int sum = 0;
        for(int c_i = 0; c_i < arr.length; c_i++) {
            System.out.print(arr[c_i] + ( c_i == arr.length - 1 ? "=" : "+" ) ) ;
            sum += arr[c_i];
        }
        System.out.println(sum);
    }
}