
public class Person implements Comparable{
	public String name;
	public String vorname;
	public Integer plz;
	public String straße;
	public Integer hausnr;
	
	public Person(String name, String vorname, Integer postleitzahl, String straße, Integer hausnummer) {
		this.name = name;
		this.vorname = vorname;
		this.plz = postleitzahl;
		this.straße = straße;
		this.hausnr = hausnummer;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Person) {
			return comparetoo((Person)o);
		}else {
			return 99;
		}
	}
	
	/* Diese Methode gibt für gleiche Zahlen/Strings 0 aus und für ungleiche 1 wenn
	 * die Zahl von this größer bzw. der String von this länger ist als der von p und
	 * analog -1 wenn die Zahl von this kleiner bzw. der String von this kürzer oder
	 * gleich lang wie der von p ist. Stringlänge ist ein etwas unpassendes Kriterium
	 * und wurde nur deshalb gewählt, weil in der Aufgabenstellung kein Kriterium für
	 * das "größer" bzw. "kleiner" sein von Personen gegeben ist.
	 */
	
	public int comparetoo(Person p) {
<<<<<<< HEAD
        int val = 0;
        val = this.name.CompareTo(p.name);
        if (val != 0) return val;
        val = this.vorname.CompareTo(p.vorname);
        if (val != 0) return val;


		if(this.name.equals(p.name)) {
			if(this.vorname.equals(p.vorname)) {
				if(this.plz == p.plz) {
					if(this.straße.equals(p.straße)) {
						if(this.hausnr == p.hausnr) {
							return 0;
						}else if(this.hausnr < p.hausnr) { return -1;
						}else { return 1; }
					}else if(this.straße.length() <= p.straße.length()){ return -1;
					}else { return 1; }
				}else if(this.plz < p.plz){ return -1;
				}else { return 1; }
			}else if(this.vorname.length() <= p.vorname.length()){ return -1;
			}else { return 1; }
		}else if(this.name.length() <= p.name.length()){ return -1;
		}else { return 1; }
=======
		int value = 0;
		if(0 != (value = this.name.compareTo(p.name))) { return value; }
		if(0 != (value = this.vorname.compareTo(p.vorname))) { return value; }
		if(0 != (value = this.plz.compareTo(p.plz))) { return value; }
		if(0 != (value = this.straße.compareTo(p.straße))) { return value; }
		if(0 != (value = this.hausnr.compareTo(p.hausnr))) { return value; }
		return 0;
>>>>>>> 1733a3c068de8712bb11af7e81eaa588634e4c6d
	}
}
