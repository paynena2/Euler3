import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		long init =  600851475143L; // initial number
		int squareRoot = (int)Math.floor(Math.sqrt(init)); //gets the square root of the number, any factor of this number will also be a factor of init
		ArrayList<Long> factors = new ArrayList<Long>(); // arraylist to store the factors
		for(long x = 2; x < squareRoot; x++) { //loop to find the factors
			if(init % x == 0) { // no remainder
				factors.add(x); // x is a factor because there is no remainder
				factors.add(init/x); // init divided by x will be a factor as well as a whole number because init mod x is 0
			}
		}
		Collections.sort(factors); //sort factors in ascending order
		Collections.reverse(factors); // reverses factors to be greatest to least, I want the highest prime factor
		for(long y : factors) {
			boolean prime = true;
			for(int z = 2; z<y; z++) { //division by zero error
				if(y % z == 0) {
					prime = false; // if divisible, not a prime
					break; //stop the loop, no further info needed
				}
			}
			if(prime) {
				System.out.println(y);
				break; //if we do find a prime, stop the loop
			}
		}
		
	}
}
