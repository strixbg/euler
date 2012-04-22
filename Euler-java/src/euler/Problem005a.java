package euler;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
 * without any remainder.
 * What is the smallest positive number that is evenly divisible by 
 * all of the numbers from 1 to 20?
 */

public class Problem005a {
	public static void main(String []args){
		long startTime = System.nanoTime();
		int i=20;
		//int increment = 20;
		while ( (i % 20!=0)||(i % 19!=0)||(i % 18!=0)||(i % 17!=0)||(i % 16!=0)||(i % 15!=0)||(i % 14!=0)||(i % 13!=0)||(i % 12!=0)||(i % 11!=0))
		{
		 i += 20;
		}
		System.out.println(i);
		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
		}
}
