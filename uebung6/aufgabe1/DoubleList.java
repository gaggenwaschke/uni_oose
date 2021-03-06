
public class DoubleList {
	private DoubleNode head;
	
	DoubleList()
	{
		head = null;
	}
	
	public void add(double d)
	{
		DoubleNode next = new DoubleNode(d);
		
		if (head == null)
		{
			head = next;
		}
		else
		{
			DoubleNode current = head;
			
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			
			current.setNext(next);
		}
	}

	public void insertFirst(double d)
	{
		DoubleNode node = new DoubleNode(d);
		node.setNext(head);
		head = node;
	}
	
	public double get(int i)
	{
		DoubleNode node = getNode(i);
		if (node == null) return 0.0;
		else return node.getValue();
	}
	
	public String toString()
	{
		String str = "";
		DoubleNode current = head;
		while(current != null)
		{
			str += current.getValue() + ";";
			current = current.getNext();
		}
		return str;
	}
	
	public void remove(int i)
	{		
		if (head == null) return;
		
		if (i == 0) 
		{
			head = head.getNext();
		}
		else
		{
			DoubleNode before = getNode(i-1);
			DoubleNode toDelete = getNode(i);
			
			if (toDelete == null)
			{
				// do nothing
			}
			else
			{
				// remove
				before.setNext(toDelete.getNext());
			}
		}
	}
	
	private DoubleNode getNode(int i)
	{
		int n = 0;
		DoubleNode node = head;
		
		while(node != null && n < i)
		{
			n++;
			node = node.getNext();
		}
		
		return node;
	}
}
