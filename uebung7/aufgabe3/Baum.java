
public class Baum {
	private TNode root;
	
	public Baum() {
	}	
	public Baum(TNode root) {
		this.root = root;
	}
	
	public TNode getRoot() {
		return root;
	}
	public void setRoot(TNode root) {
		this.root = root;
	}
	
	public static void Inorder(TNode node) {
		TNode next = node.getLeft();
		if (next != null)
		{
			Inorder(next);
		}
		
		System.out.print(node.getValue() + ",");
		
		next = node.getRight();
		if (next != null)
		{
			Inorder(next);
		}
	}
	
	public static void Preorder(TNode node) {
		System.out.print(node.getValue() + ",");
		
		TNode next = node.getLeft();
		if (next != null)
		{
			Preorder(next);
		}
		
		next = node.getRight();
		if (next != null)
		{
			Preorder(next);
		}
	}
	
	public static void Postorder(TNode node) {				
		TNode next = node.getLeft();
		if (next != null)
		{
			Postorder(next);
		}
		
		next = node.getRight();
		if (next != null)
		{
			Postorder(next);
		}
		
		System.out.print(node.getValue() + ",");
	}
	
	public static void Levelorder(TNode node) {
		java.util.LinkedList<TNode> list = new java.util.LinkedList<TNode>();
		
		list.add(node);
		
		while(!list.isEmpty()) {
			TNode current = list.removeFirst();
			System.out.print(current.getValue() + ",");
			TNode next = current.getLeft();
			if (next != null)
			{
				list.addLast(next);
			}
			next = current.getRight();
			if (next != null)
			{
				list.addLast(next);
			}
		}
	}
}
