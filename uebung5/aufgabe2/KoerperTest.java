
import java.util.ArrayList;

public class KoerperTest {
	public static void main(String[] args) {
		ArrayList<Koerper> l = new ArrayList<Koerper>();
		l.add(new Kugel(new Vector3d(1.0, 2.0, 3.0), 4));
		l.add(new Quader(new Vector3d(0.0, 0.0, 0.0), new Vector3d(1.0, 1.0, 1.0)));
		
		for (Koerper k: l) {
			System.out.println(k.toString());
		}
	}
}
