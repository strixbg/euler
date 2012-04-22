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

public class Problem006a {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(sqs(100) - ssq(100));
		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
	}
	public static int ssq(int m) {
		int answer = 0;
		for(int i = 1; i <= m; i++) {
			answer += i*i;
		}
		return answer;
	}
	public static int sqs(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer += i;
		}
		answer = answer*answer;
		return answer;
	}
}