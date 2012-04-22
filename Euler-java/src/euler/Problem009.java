package euler;

/*
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class Problem009 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i = 1; i <= 1000; i++){
            b = 1;
            for(int j=1;j <= 1000;j++){
                c = 1;
                for(int k = 1; k <= 1000; k++){
                    if((a+b+c == 1000) && (a*a + b*b == c*c)){
                        System.out.println("answer is " + a*b*c);
                        long endTime = System.nanoTime();
                        System.out.printf("Total Time: %.6f seconds\n", ((endTime - startTime)/1000000000.0));
                        System.exit(0);
                    }
                    c++;
                }
                b++;
            }
            a++;
        }
        
    }
    
}