package euler;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 *  we can see that the 6th prime is 13.
 *  What is the 10 001st prime number?
 */
public class Problem007 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int array[] = new int[10001];
		int count = 0;
		int i = 2;
		while(count <= 10000) {
			if(isPrime(i) == true) {
				array[count] = i;
				count++;
			}
			i++;
		}
		System.out.println(array[10000]);
		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
	}
	
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}