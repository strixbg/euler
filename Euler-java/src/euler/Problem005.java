package euler;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
 * without any remainder.
 * What is the smallest positive number that is evenly divisible by 
 * all of the numbers from 1 to 20?
 */

public class Problem005 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		boolean isSolution = false;
		int number = 20;
		while(isSolution == false) {
			number += 20;
			if(		(number % 11 == 0) && (number % 12 == 0) && (number % 13 == 0) &&
					(number % 14 == 0) && (number % 15 == 0) && (number % 16 == 0) &&
					(number % 17 == 0) && (number % 18 == 0) && (number % 19 == 0) &&
					(number % 20 == 0))
			{
					isSolution = true;
			}
			
		}
		System.out.println(number);
		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
	}

}
