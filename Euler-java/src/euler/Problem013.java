package euler;

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
