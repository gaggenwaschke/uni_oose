
class Essen {
	public static void main(String args[]) {
		Cauliflower essen1 = new Cauliflower();
		Student.eat(essen1);
		Spaghetti essen2 = new Spaghetti();
		Student.eat(essen2);
		Food essen = new Cauliflower();
		Student.eat(essen);
	}
}


/* Änderungen im Vergleich zur Version vom Blatt:
 * eat-Methoden wurden auf Anraten von eclipse static gemacht, damit das Programm läuft
 * der Aufruf student.eat wurde in Student.eat geändert, da die Klasse Student und nicht student heißt und sonst der Aufruf nicht funktioniert*/