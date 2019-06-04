
public class DoubleNode {
	private double value;
	private DoubleNode next;
	
	DoubleNode()
	{
		value = 0.0;
		next = null;
	}
	
	DoubleNode(double value)
	{
		this.value = value;
		next = null;
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public DoubleNode getNext() {
		return next;
	}
	public void setNext(DoubleNode next) {
		this.next = next;
	}
}
