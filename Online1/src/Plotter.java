import java.util.*;

public class Plotter {
	public static void druckeWertetabelle(IFunktion f, double a, double b) {
		if (a > b) {
			double temp = b;
			b = a;
			a = temp;
		}
		System.out.println("x\tf(x)");
		while(a < b) {
			System.out.println(a + "\t" + f.evaluate(a));
			a += 0.1;
		}
	}
	
	public static void druckeGraph(IFunktion f, double a, double b) {
		if (a > b) {
			double temp = b;
			b = a;
			a = temp;
		}
		while(a < b) {
			double value = f.evaluate(a);
			for (double i = 0; i < value; i+= 0.1) {
				System.out.print(" ");
				if (a > 10) break;
			}
			System.out.println("o");
			a += 0.1;
		}
	}
	
	public static List<IFunktion> derivations(IFunktion f, int n) {
		List<IFunktion> temp = new ArrayList<IFunktion>();
		temp.add(f.derivate());
		
		for (int i = 1; i < n; i++) {
			temp.add(temp.get(i-1).derivate());
		}
		
		return temp;
	}
}
