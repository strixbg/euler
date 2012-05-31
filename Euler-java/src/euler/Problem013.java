package euler;

/**
 * Work out the first ten digits of the sum of the following
 * one-hundred 50-digit numbers.
 *
 * Input is read from the file Problem013.txt, so it 
 * must be in the same directory with Problem013.class file
 * Run program from parent directory using 
 *  java euler/Problem013  
 */

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem013 {
	public static void main(String[] args){
		long startTime = System.nanoTime();
		
		ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();
		try {
			FileInputStream fstream = new FileInputStream("Problem013.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null)   {
				numbers.add(new BigInteger(strLine));
			}
			in.close();
		}
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		BigInteger sum = new BigInteger("0");
		for (BigInteger numbersTemp : numbers) {
		    sum = sum.add(numbersTemp);
		}

		System.out.println(sum.toString().substring(0,10));

		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
	}

	
}
