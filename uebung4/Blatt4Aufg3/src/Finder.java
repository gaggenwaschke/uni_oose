
public class Finder {
	public static Comparable findMin(Comparable[] x) {
		Comparable kleinstes = x[0];
		int n = x.length;
		for(int i = 1; i < n; i++) {
			if(kleinstes.compareTo(x[i]) > 0) {
				kleinstes = x[i];
			}
		}
		return kleinstes;
	}
}
