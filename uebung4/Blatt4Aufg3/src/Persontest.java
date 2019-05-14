
public class Persontest {
	public static void main(String args[]) {
		Person person1 = new Person("Schneider", "Peter", 69420, "Musterdorf", 31);
		Person person2 = new Person("Meier", "Rosi", 32168, "Musterstadt", 69);
		String person3 = "Schneider"; //Um zu testen, ob CompareTo erkennt, dass es sich nicht um eine Person handelt
		Person person4 = new Person("Schneider", "Peter", 69420, "Musterdorf", 31);
		System.out.println("person 1, person 2: " + person1.compareTo(person2));
		System.out.println("person 1, person 3: " + person1.compareTo(person3));
		System.out.println("person 1, person 4: " + person1.compareTo(person4));
		Comparable[] persarr = {person1, person2, person4};
		Comparable kleinstes = Finder.findMin(persarr);
		Person kleinster = (Person) kleinstes;
		System.out.println(kleinster.vorname + " " + kleinster.name + " wohnhaft in " + kleinster.straße + " " + kleinster.hausnr + " " + kleinster.plz + " ist das kleinste Element");
	}
}
