public class BeobachterTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		DateiBeobachter obacht = new DateiBeobachter("test.txt");
		obacht.run();
	}
}
