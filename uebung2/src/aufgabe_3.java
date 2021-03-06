
public class aufgabe_3 {

	/**
	 * berechnet den euklidschen Algorithmus
	 * @param args a, b
	 */
	public static void main(String[] args) {
		long a = Long.parseLong(args[0]);
		long b = Long.parseLong(args[1]);
		
		System.out.println("ggt von " + a + " und " + b + " = " + euklid(a,b));
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static long euklid(long a, long b) {
		if (a == 0) return b;
		
		while (b != 0) {
			if (a > b) {
				a = a-b;
			} else {
				b = b-a;
			}
		}
		return a;
	}

}
