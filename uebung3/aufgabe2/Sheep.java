public class Sheep {
	public String name;
	public Fur fur;
	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}
	public void shear() {
		fur.length = 0;
	}
	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}
	public Sheep shallowClone() {
		return this;
	}
	public Sheep deepClone() {
		Fur newFur = fur.deepClone();
		return new Sheep(name, newFur);
	}
	public boolean equals(Object o)
	{
		if (o instanceof Sheep )
		{
			Sheep oSheep = (Sheep)o;
			if (fur.equals(oSheep.fur) && name == oSheep.name) return true;
			else return false;
		} else return false;
	}
}