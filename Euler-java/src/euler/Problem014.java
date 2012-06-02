package euler;

/**
 * The following iterative sequence is defined for the set of positive
 * integers:
 *
 * n ->  n/2 (n is even)
 * n -> 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 *
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at
 * 1) contains 10 terms. Although it has not been proved yet (Collatz
 * Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest
 * chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one
 * million.
 */

public class Problem014 {
    public static void main(String[] args) {
    	long startTime = System.nanoTime();
        long number;
        long chain;
        long maxChain = 0;
        long maxSequence = 0;
        for(int i = 1; i <= 1000000; i++) {
            number = i;
            chain = 0;
            while(true) {
            	if(number == 1) {
            		chain++;
            		break;
            	}
            	else {
            		if(number % 2 == 0) {
            			number = number / 2;
            			chain++;
            		}
            		else {
            			number = (3 * number) + 1;
            			chain++;
            		}
            	}
             }
            if(chain > maxChain) {
                maxChain = chain;
                maxSequence = i;
        }
    }
        long endTime = System.nanoTime();
    	System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
        System.out.println("Number = " + maxSequence);
        System.out.println("Longest sequence = " + maxChain);
    }
}
