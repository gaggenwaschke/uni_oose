import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestExceptions {
	public static void main(String[] args) throws NumberTooSmallException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Bitte geben Sie die Anzahl der Benutzer ein!");
		int players = 0;
		try
		{
			String input = reader.readLine();
			players = Integer.parseInt(input);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		if (players > 5) throw new NumberTooBigException();
		if (players < 5) throw new NumberTooSmallException();
		
		System.out.println("All fine");
	}
}

// NumberTooBigException ist eine ungeprüfte Exception. Dadurch muss die aufrufende
// Funktion keinen Handler angeben. NumberTooSmallException ist geprüft.
// Daher muss zur compile Zeit schon ein Handler zur Verfügung gestellt werden.
// Das kann entweder durch einen try catch block geschehen, oder durch markieren
// der aufrufenden funktion durch throws
