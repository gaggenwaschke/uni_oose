
public class Aufgabe3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stereoanlage s=new Stereoanlage();
		Playable pl=new CD();
		s.play(pl);
		pl = new Kassette();
		s.play(pl);
	}
}
