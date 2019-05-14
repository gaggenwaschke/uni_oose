
public class Quader extends Koerper {
	private Vector3d sizes;
	
	public Quader(Vector3d position, Vector3d sizes) {
		super(position);
		this.sizes = sizes;
	}
	
	public Vector3d getSizes() {
		return sizes;
	}
	
	@Override
	public void scale(double a) {
		sizes = Vector3d.scale(sizes, a);
	}
	
	@Override
	public double getVolume() {
		return sizes.getX() * sizes.getY() * sizes.getZ();
	}

	@Override
	public String toString() {
		return "Quader mit linker, unterer, vorderer Ecke bei " + getP().toString() + " und Größe " + getSizes().toString();
	}
}
