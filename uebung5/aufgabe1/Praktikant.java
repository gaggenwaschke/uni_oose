
public class Praktikant extends Angestellter {
	protected static final int gehalt = 400;
	
	public Praktikant(String vorname, String nachname, int alter) {
		super(vorname, nachname, alter, Praktikant.gehalt);
		// TODO Auto-generated constructor stub
	}
	
	public int getGehalt() {
		return Praktikant.gehalt;
	}
	
	public void erhoeheGehalt(int erhoehung) {
		// do nothing
	}	
	
}
