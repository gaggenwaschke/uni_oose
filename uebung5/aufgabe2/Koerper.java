
public abstract class Koerper {
	protected Vector3d p;
	
	protected Koerper(Vector3d position) {
		this.p = position;
	}
	
	public Vector3d move(Vector3d offset) {
		return p = Vector3d.add(p, offset);
	}
	
	public Vector3d getP() {
		return p;
	}
	
	public abstract void scale(double a);
	
	public abstract double getVolume();
	
	@Override
	public String toString() {
		return "Körper mit Position" + p.toString();
	}
}
