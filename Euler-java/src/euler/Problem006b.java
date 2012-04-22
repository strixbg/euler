package euler;

/*
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers
 *  and the square of the sum is 3025 - 385 = 2640.
 *  Find the difference between the sum of the squares of the first one hundred
 *   natural numbers and the square of the sum.
 */

public class Problem006b {
	public static void main(String [] args) { 
		long startTime = System.nanoTime();
		int answer = 0; 
		for(int i = 1; i <100; i++) { 
			for(int j = (i+1); j <= 100; j++) { 
				answer += i * j; 
			} 	
		} 
		answer *= 2; 
		System.out.println(answer); 
		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
	} 
	
}