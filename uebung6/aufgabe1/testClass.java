
public class testClass
{
	public static void main(String[] args)
	{
		DoubleList l = new DoubleList();
		l.add(1.0);
		l.add(2.0);
		l.add(3.0);
		l.insertFirst(4.0);
		l.insertFirst(5.0);
		
		System.out.println("after add and insertFirst");
		System.out.println(l.toString());
		
		l.remove(2);
		l.remove(0);
		l.remove(2);
		
		System.out.println("after removes");
		System.out.println(l.toString());
		
		System.out.println("erstes element: " + l.get(0));
	}

}
