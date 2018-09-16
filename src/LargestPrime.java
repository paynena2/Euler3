import java.util.ArrayList;
import java.util.Collections;

public class LargestPrime {
	public static void main(String[] args) {
		long init = 600851475143L; //Given number
		long stop = init/7; // first number that divides evenly
		ArrayList<Long> factors = new ArrayList<Long>(); // list of factors
		for(long x = stop ; x >1; x-- ) {
			System.out.println("first loop" + " " + x);
			if(init % x == 0) { // first number mod x should be zero if factor
				if(isPrime(x)) { //checks if the number is a prime
					factors.add(x); //if the number is a prime factor, add it to the factor arraylist
				}
			}
		}
		System.out.println(Collections.max(factors)); // show the largest factor
	}
	public static boolean isPrime(long num) {
		for(long x=2; x < num; x++) {
			System.out.println("Second loop" + x);
			if (num % x == 0) {
				return false;
			}
			
		}
		return true;
	}
}
