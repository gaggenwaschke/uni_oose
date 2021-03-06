import java.util.*;

public class Schifffahrtsamt {
	private String name;
	private List<Schiff> schiffe;
	
	public Schifffahrtsamt(String name) {
		this.name = name;
		schiffe = new ArrayList<Schiff>();
	}
	
	public void regestriereSchiff(Schiff schiff) {
		this.schiffe.add(schiff);
	}
	
	public void meldung(String nachricht, int dringlichkeit) {
		if (dringlichkeit == 1) {
			for (Schiff schiff: this.schiffe) {
				schiff.empfangeNachricht(nachricht);
			}
		}
	}
	
	public static String getKennzeichen() {
		java.util.Random rnd = new java.util.Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 6; i++) {
			sb.append((char)((rnd.nextInt(25)+65)));
		}
		return sb.toString();
	}
}