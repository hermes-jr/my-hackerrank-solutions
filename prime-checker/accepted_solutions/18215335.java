import static java.lang.System.*;

class Prime {
    public void checkPrime(int... args) {
        outer:
        for(int isPrime: args) {
            if ( ( isPrime != 2 && isPrime % 2 == 0 ) || isPrime == 1) continue outer;

            for(int i=3; i * i <= isPrime; i += 2) {
                if(isPrime % i == 0)
                   continue outer;
            }
            System.out.print(isPrime + " ");
        }
        System.out.println("");
    }
}
