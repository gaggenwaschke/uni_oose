
public class aufgabe_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = Long.parseLong(args[0]);
		long k = Long.parseLong(args[1]);
		
		System.out.println(lotto(n, k));
	}
	
	/**
	 * Rekursive implementierung der Fakultät
	 * @param n
	 * @return
	 */
	private static long fakultaet(long n) {
		if (n == 1) return 1;
		return fakultaet(n-1)*n;
	}
	
	/**
	 * Iterative Implementierung des Binomialkoeffizienten.
	 * @param n
	 * @param k
	 * @return
	 */
	private static long binomialkoeffizient(long n, long k) {
		long t = 1;
		long lowerLimit = n - k + 1;
		while(n >= lowerLimit) {
			t *= n;
			n--;
		}
		while(k > 1) {
			t /= k;
			k--;
		}
		return t;
	}
	
	/**
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	private static long lotto(long n, long k) {
		return binomialkoeffizient(n, k) * fakultaet(k);
	}

}
