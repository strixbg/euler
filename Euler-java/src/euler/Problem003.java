package euler;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

class Problem003
{
	public static void main(String args[])
	{
		long number=600851475143L;
		System.out.println("Given Number is : " + number);
		System.out.print("Prime Factors are : " );
		for (int i = 2; i <= number / i; i++) {
			while (number % i == 0) {
	            System.out.print(i + ","); 
	            number = number / i;
	        }
	    }
		if (number > 1) System.out.println(number);
	 }

}
