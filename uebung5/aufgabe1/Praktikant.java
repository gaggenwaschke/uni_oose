
public class Praktikant extends Angestellter {
	protected static final int gehalt = 400;
	
	public Praktikant(String vorname, String nachname, int alter) {
		super(vorname, nachname, alter, Praktikant.gehalt);
	}
	
	public int getGehalt() {
		return Praktikant.gehalt;
	}
	
	public void erhoeheGehalt(int erhoehung) {
		// do nothing
	}	
	
}
