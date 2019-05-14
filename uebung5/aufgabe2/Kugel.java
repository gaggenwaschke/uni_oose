
public class Kugel extends Koerper {
	private double r;
	
	public Kugel(Vector3d position, double radius) {
		super(position);
		this.r = radius;
	}
	
	public double getR() {
		return r;
	}
	
	@Override
	public void scale(double a) {
		r *= a;
	}
	
	@Override
	public double getVolume() {
		return Math.PI * r*r*r * 4.0 / 3.0;
	}
	
	@Override
	public String toString() {
		return "Kugel mit Mittelpunkt " + this.getP().toString() + " und Radius " + this.getR();
	}
}