
public class EFunktion implements IFunktion {
	private double a;
	private double b;
	
	public EFunktion(double a, double b) {
		this.a = a;
		this.b = b;
	}	

	public double evaluate(double x) {
		return a * Math.exp(b*x);
	}
	
	public IFunktion derivate() {
		return new EFunktion(a*b, b);
	}
	
	public String toString() {
		return "" + a + "*e^(" + b + "x)";
	}
}
