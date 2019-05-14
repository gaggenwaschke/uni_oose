
public class Koerper {
	protected Vector3d p;
	
	public Koerper(Vector3d position) {
		this.p = position;
	}
	
	public Vector3d move(Vector3d offset) {
		return p = Vector3d.add(p, offset);
	}
	
	public Vector3d getP() {
		return p;
	}
	
	public void scale(double a) {
		// do nothing, just virtual
	}
	
	public double getVolume() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Körper mit Position" + p.toString();
	}
}