class Angestellter {
	private final String vorname;
	private final String nachname;
	private int alter;
	protected int gehalt;
		
	public Angestellter(String vorname, String nachname, int alter, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
	
	public int getAlter() {
		return alter;
	}	
	public int getGehalt() {
		return gehalt;
	}	
	public String getNachname() {
		return nachname;
	}	
	public String getVorname() {
		return vorname;
	}
	
	public void imkrementAlter() {
		alter += 1;
	}
	
	public void erhoeheGehalt(int erhoehung) {
		gehalt += erhoehung;
	}
}