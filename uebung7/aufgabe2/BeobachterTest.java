import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
