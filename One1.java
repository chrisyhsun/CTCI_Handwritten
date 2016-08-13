public class One1 {
	public static void main(String...args) {
		String test0 = "abfotjdhw";
		if(unique(test0)) {
			System.out.println(test0 + " is unique");
		}
		else {
			System.out.println(test0 + " is not unique");
		}
		String test1 = "aa";
		if(unique(test1)) {
			System.out.println(test1 + " is unique");
		}
		else {
			System.out.println(test1 + " is not unique");
		}
	}

	public static boolean unique(String s) {
		//should check if string length more than unique chars
		//assumes only alphabet and that 'A' and 'a' are not unique
		s = s.toLowerCase();
		boolean[] alpha = new boolean[26];
		for(int i = 0; i < s.length(); i++) {
			if(alpha[s.charAt(i) - 'a']) {
				return false;
			}
			alpha[s.charAt(i) - 'a'] = true;
		}
		return true;
	}
}
