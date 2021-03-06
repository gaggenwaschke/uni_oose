public class Fur {
	public int length;
	public Fur(int length) {
		this.length = length;
	}
	public String toString() {
		return "Felllaenge: " + length;
	}
	public Fur deepClone() {
		return new Fur(length);
	}
	public boolean equals(Object o)
	{
		if (o instanceof Fur)
		{
			Fur oFur = (Fur)o;
			if (oFur.length == length) return true;
			else return false;
		} else return false;
	}
}