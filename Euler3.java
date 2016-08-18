public class Euler3 {
	public static void main(String...args) {
		System.out.println(largestPrime(600851475143));
	}

	public static int largestPrime(long num) {
		int size = (int) /*sommehow need to get the long to an int?*/  + 1;
		boolean[] prime = new boolean[size + 1];
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
		for(int i = prime.length - 1; i >= 2; i--) {
			if(prime[i]) return i;
		}
	}
}
