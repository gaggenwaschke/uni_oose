
public class Werft {
	public Werft() {
		
	}
	
	public Schiff produziereSchiff(String name, double laenge, Schifffahrtsamt amt) {
		Schiff schiff = new Schiff(name, laenge);
		amt.regestriereSchiff(schiff);
		schiff.setKennzeichen(amt.getKennzeichen());
		return schiff;
	}
}
