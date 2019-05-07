
public class Test {
	public static void main (String[] args) {
		C1 a=new C2();
		C2 b=new C2();
		// Stelle 1
		((C2) a).f1();		// C2::f1
		((C1) b).f1();		// C2::f1
		System.out.println(a.s); // 1
		b.f1();				// C2::f1
		b.f2();				// C1::f2
		b.f3();				// C2::f3
		C1 c = new C1(); c.f3();  // fails, C1 does not have any f3
		C1 c = new C1(); ((C2) c).f1();   // fails, C1 does not contain, what C2 needs
	}
}