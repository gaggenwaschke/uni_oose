import java.util.List;


public class Main {
	
	private static void printList(List<Integer> lst) {
		System.out.print("[");
		for (Integer i : lst) {
			System.out.print(i + ",");
		}
		System.out.println("]");
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// 2a
		System.out.println("------------------2a---------------");
		
		int lower = 1;
		int upper = 4000;
		List<Integer> prims = PrimzahlRechner.primzahlenZwischen(lower, upper);
		printList(prims);
		
		// 3a
		System.out.println("\n------------------3a---------------");
		
		PrimzahlRechner r1 = new PrimzahlRechner(1, 1000);
		PrimzahlRechner r2 = new PrimzahlRechner(1001, 2000);
		PrimzahlRechner r3 = new PrimzahlRechner(2001, 3000);
		PrimzahlRechner r4 = new PrimzahlRechner(3001, 4000);
		
		// 3d
		long timeStart = System.nanoTime();		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		
		r1.join();
		r2.join();
		r3.join();
		r4.join();
		System.out.println("old = " + (System.nanoTime()-timeStart)/1000 + "µs");
		
		printList(r1.getErgebnis());
		printList(r2.getErgebnis());
		printList(r3.getErgebnis());
		printList(r4.getErgebnis());
		
		/*
		 * r1 wird als rester fertig, da die Komplexität je Berechnung
		 * mit dieser Methode O(sqrt(x)) ist, wobei x die zu überprüfende
		 * Zahl ist.
		 * Die Gesamtkomplexität ist also das integral von der unteren zur
		 * oberen Grenze über sqrt(x). Das ist (2/3 * x^(1.5)).
		 * Damit lässt sich die obere Grenze für jeden Thread aus
		 * oben_m = ((oben^(3/2) - unten^(3/2))/m + unten_m^(3/2))^2/3
		 */
		System.out.println("\n\nschnellere Methode:\n");
		double m = 4;
		double unten = 1;
		double oben = 4000;
		double unten_1 = 1;
		double oben_1 = Math.pow(((Math.pow(oben, 1.5) - Math.pow(unten, 1.5)) / m) + Math.pow(unten_1, 1.5), 1/1.5);
		double unten_2 = oben_1+1;
		double oben_2 = Math.pow(((Math.pow(oben, 1.5) - Math.pow(unten, 1.5)) / m) + Math.pow(unten_2, 1.5), 1/1.5);
		double unten_3 = oben_2+1;
		double oben_3 = Math.pow(((Math.pow(oben, 1.5) - Math.pow(unten, 1.5)) / m) + Math.pow(unten_3, 1.5), 1/1.5);
		double unten_4 = oben_3+1;
		double oben_4 = Math.pow(((Math.pow(oben, 1.5) - Math.pow(unten, 1.5)) / m) + Math.pow(unten_4, 1.5), 1/1.5);
		
		System.out.println("Grenzen: [" + ((int)unten_1) + ".." + ((int)oben_1) + "], " + 
				"[" + ((int)unten_2) + ".." + ((int)oben_2) + "], " +
				"[" + ((int)unten_3) + ".." + ((int)oben_3) + "], " +
				"[" + ((int)unten_4) + ".." + ((int)oben_4) + "]");
		
		r1 = new PrimzahlRechner((int)unten_1, (int)oben_1);
		r2 = new PrimzahlRechner((int)unten_2, (int)oben_2);
		r3 = new PrimzahlRechner((int)unten_3, (int)oben_3);
		r4 = new PrimzahlRechner((int)unten_4, (int)oben_4);
		
		// 3d
		timeStart = System.nanoTime();		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		
		r1.join();
		r2.join();
		r3.join();
		r4.join();
		System.out.println("new = " + (System.nanoTime()-timeStart)/1000 + "µs");
		
		printList(r1.getErgebnis());
		printList(r2.getErgebnis());
		printList(r3.getErgebnis());
		printList(r4.getErgebnis());
		
		
	}

}
