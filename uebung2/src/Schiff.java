
public class Schiff {
	private String name;
	private String kennzeichen;
	private double laenge;
	
	public Schiff(String name, double laenge) {
		this.name = name;
		this.laenge = laenge;
	}
	
	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	
	public void empfangeNachricht(String nachricht) {
		System.out.println(this.name + "(" + this.kennzeichen + "): " + nachricht);
	}
}