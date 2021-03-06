import java.util.*;


public class TesteFunktionen {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IFunktion f = new EFunktion(0.25, 1.75);
		System.out.println("f(x)");
		Plotter.druckeWertetabelle(f, 0.0, 1.0);
		Plotter.druckeGraph(f, 0.0, 1.0);
		
		List<IFunktion> l = Plotter.derivations(f, 2);
		System.out.println("f'(x)");
		Plotter.druckeWertetabelle(l.get(0), 0.0, 1.0);
		Plotter.druckeGraph(l.get(0), 0.0, 1.0);
		
		System.out.println("f''(x)");
		Plotter.druckeWertetabelle(l.get(1), 0.0, 1.0);
		Plotter.druckeGraph(l.get(1), 0.0, 1.0);		
	}
}
