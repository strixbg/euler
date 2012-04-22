package euler;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
 * without any remainder.
 * What is the smallest positive number that is evenly divisible by 
 * all of the numbers from 1 to 20?
 */

public class Problem005b {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int sum = 1;
		boolean remainder = true;
		
		while(remainder) {
			remainder = checkRemainder(sum);
			if(remainder)
				sum++;
		}
		
		System.out.println(sum);
		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
	}
	
	public static boolean checkRemainder(int sum) {
		
		for(int i = 1; i <= 20; i++) {
			if(sum % i != 0)
				return true;
		}
		
		return false;
	}
}
