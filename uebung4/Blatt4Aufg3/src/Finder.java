
public class Finder {
	public static Comparable findMin(Comparable[] x) {
		Person kleinstes = (Person)x[0];
		int n = x.length;
		for(int i = 1; i < n; i++) {
			if(kleinstes.compareTo(x[i]) > 0) {
				kleinstes = (Person)x[i];
			}
		}
		return kleinstes;
	}
}
