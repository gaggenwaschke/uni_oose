import java.util.LinkedList;
import java.util.List;

public class PrimzahlRechner extends Thread {
	private List<Integer> ergebnis;
	private final int anfang;
	private final int ende;
	
	public PrimzahlRechner(int anfang, int ende) {
		this.anfang = anfang;
		this.ende = ende;
	}
	
	@Override
	public void run() {
		this.ergebnis = primzahlenZwischen(this.anfang, this.ende);		
	}
	
	// getter
	public List<Integer> getErgebnis() {
		return ergebnis;
	}
	
	// statics
	public static boolean istPrimzahl(int x) {
		if (x < 2) return false;
		int upperLim = (int)Math.round(Math.sqrt(x));
		for (int i = 2; i <= upperLim; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static List<Integer> primzahlenZwischen(int anfang, int ende) {
		List<Integer> prims = new LinkedList<Integer>();
		
		for (int i = anfang; i <= ende; i++) {
			if (istPrimzahl(i)) {
				prims.add(i);
			}
		}
		return prims;
	}
}
