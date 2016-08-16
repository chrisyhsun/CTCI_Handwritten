public class Euler1 {
	public static void main(String...args) {
		System.out.println(sumMultRange(3, 0, 1000)
				+ sumMultRange(5, 0, 1000)
				- sumMultRange(15, 0, 1000));
	}

	public static long sumMultRange(long mult, long lower, long upper) {
		upper--;
		for(long i = 0; i < mult; i++) {
			if((lower + i) % mult == 0) lower += i;
		}
		for(long i = 0; i < mult; i++) {
			if((upper - i) % mult == 0) upper -= i;
		}
		long high = upper / mult;
		long low = lower / mult;
		long sum = (high + low) * (high - low + 1) / 2;
		return sum * mult;
	}
}
