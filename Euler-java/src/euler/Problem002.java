package euler;

/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
public class Problem002 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 1;
		int f;
		while((f = fibonacci(n)) <= 4000000) {
			sum += f % 2 == 0 ? f : 0;
			n++;
		}
		System.out.println(sum);
	}
		
	public static int fibonacci(int n) {
		return n == 1 ? 1 : n == 2 ? 2 : fibonacci(n-1)+fibonacci(n-2);
	}

}
