public class Euler2 {
	public static void main(String...args) {
		System.out.println(sumEvenFib(4000000));
	}

	public static long sumEvenFib(long max) {
		long prev = 1;
		long cur = 1;
		long sum = 0;
		long tmp = 0;
		while(cur + prev < max) {
			tmp = cur;
			cur += prev;
			prev = tmp;
			if(cur % 2 == 0) {
				sum += cur;
			}
		}
		return sum;
	}
}
