
public class TNode {
	private TNode left;
	private TNode right;
	private Integer value;
	
	public TNode(Integer value)	{
		this.value = value;
	}
	
	public TNode getLeft() {
		return left;
	}
	public TNode getRight() {
		return right;
	}
	public Integer getValue() {
		return value;
	}
	public void setLeft(TNode left) {
		this.left = left;
	}
	public void setRight(TNode right) {
		this.right = right;
	}
	
	public String toString() {
		return value.toString();
	}
}
