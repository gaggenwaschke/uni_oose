public class Foo {
	public static <T> T bar(T x, T y) {
		return x;
	}
	public static void main(String[] args) {
		Object o;
		R r = new R();
		E e = new E();
		B b = new B();
		G g = new G();
		U u = new U();
		R[] x;
		E[] y;
		
		r = bar(r, b);
		r = bar(b, r);
		r = bar(e, g);
		r = bar(b, g);
		//e = bar(r, b);
		//u = bar(u, r);
		o = bar(e, u);
		//b = bar(e, g);
		x = bar(new E[2], new B[4]);
		//y = bar(new E[4], new B[11]);
		o = bar(new G[8], new U[5]);
	}
}

/*	1)	Klappt, return ist typ R, b ist subclass R, damit ist generischer Typ R.
 * 	2)	Siehe 1)
 * 	3)	Klappt, return ist typ R, die beiden anderen sind davon abgeleitet.
 * 	4)	Siehe 3)
 * 	5)	Kompiliert nicht, return ist E, R kann nicht nach E gecastet werden.
 * 	6)	Kompiliert nicht, return ist typ U, r hat damit nichts zu tun.
 * 	7)	Klappt, alle sind von Object abgeleitet
 * 	8)	Kompiliert nicht, E kann nicht nach b gecastet werden.
 * 	9)	Klappt, alles Array von R
 * 	10)	Kompiliert nicht, B kann nicht nach E gecastet werden.
 * 	11)	Klappt, alle sind object arrays.
 * 
 * 
 */
