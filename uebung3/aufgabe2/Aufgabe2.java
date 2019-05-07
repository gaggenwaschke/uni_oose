
public class Aufgabe2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fur leylaFur = new Fur(10);
		Sheep leyla = new Sheep("Leyla", leylaFur);
		Sheep luisa = leyla.shallowClone();
		Sheep lily = leyla.deepClone();
		
		System.out.println("Ausgabe 1");
		System.out.println(leyla.toString());
		System.out.println(luisa.toString());
		System.out.println(lily.toString());
		
		luisa.name = "luisa";
		luisa.shear();
		lily.name = "lily2";
		lily.shear();
		
		System.out.println("Ausgabe 2");
		System.out.println(leyla.toString());
		System.out.println(luisa.toString());
		System.out.println(lily.toString());
	}

}
