
public class Findervariant {
	public static Person findMin(Person[] x) {
		Person kleinstes = x[0];
		int n = x.length;
		for(int i = 1; i <= n; i++) {
			if(kleinstes.compareTo(x[i]) > 0) {
				kleinstes = x[i];
			}
		}
		return kleinstes;
	}
}
