
public class Vector3d {
	private double x;
	private double y;
	private double z;
	
	public Vector3d(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3d(Vector3d template) {
		this.x = template.x;
		this.y = template.y;
		this.z = template.z;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	
	@Override
	public String toString() {
		return "[" + x + ", " + y + ", " + z + "]";
	}
	
	public static Vector3d add(Vector3d a, Vector3d b) {
		Vector3d temp = new Vector3d(a);
		temp.x += b.x;
		temp.y += b.y;
		temp.z += b.z;
		
		return temp;
	}
	
	public static Vector3d sub(Vector3d a, Vector3d b) {
		Vector3d temp = new Vector3d(a);
		temp.x -= b.x;
		temp.y -= b.y;
		temp.z -= b.z;
		
		return temp;
	}
	
	public static Vector3d scale(Vector3d a, double scalar) {
		Vector3d temp = new Vector3d(a);
		temp.x *= scalar;
		temp.y *= scalar;
		temp.z *= scalar;
		
		return temp;
	}
}
