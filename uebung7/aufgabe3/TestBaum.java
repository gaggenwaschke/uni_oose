
public class TestBaum {
	public static void main(String[] args) {
		Baum t = new Baum();
		TNode right = new TNode(4);
		TNode mid = new TNode(3);
		mid.setRight(right);
		TNode left = mid;
		mid = new TNode(5);
		mid.setLeft(left);
		mid.setRight(new TNode(7));
		left = mid;
		mid = new TNode(10);
		mid.setLeft(left);
		
		t.setRoot(mid);
		
		mid = new TNode(13);
		left = mid;
		mid = new TNode(15);
		mid.setLeft(left);
		right = mid;
		mid = new TNode(12);
		mid.setRight(right);
		right = mid;
		t.getRoot().setRight(right);
		
		System.out.println("inorder");
		Baum.Inorder(t.getRoot());
		System.out.println("\npreorder");
		Baum.Preorder(t.getRoot());
		System.out.println("\npostorder");
		Baum.Postorder(t.getRoot());
		System.out.println("\nlevelorder");
		Baum.Levelorder(t.getRoot());
	}

}
