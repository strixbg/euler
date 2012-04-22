package euler;

/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem004 {


	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int numOne = 0;
		int numTwo = 0;
		
		for(int i = 999; i > 9; i--) {
			for(int j = 999; j > 9; j--) {
				if(isPalindrome(Integer.toString(i*j)) == true && i*j > numOne * numTwo) {
					numOne = i;
					numTwo = j;
				}
				
			}
		}
		System.out.println(numOne + "," + numTwo + " = " + numOne*numTwo);
		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
	}
	public static boolean isPalindrome(String in) {
		String string = new StringBuffer(in).reverse().toString();
		return(in.equals(string));
		
	}

}
