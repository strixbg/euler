package euler;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */


public class Problem010 {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        long answer = 0;
        for(long i = 1; i < 2000000; i++){
            if(isPrime(i) == true){
                answer += i;
            }
        }
        System.out.println("answer is " + answer);
        long endTime = System.nanoTime();
	System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
    }
    
    public static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
}