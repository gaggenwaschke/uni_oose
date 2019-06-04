import java.io.IOException;

public class ExceptionInheritance {
	public static void main(String[] args) throws IOException {
		Hamburger c=new Hamburger();
		c.eat();
	}
}

//	a)	kompiliert und ist gültig. Abgeleitete Klassen müssen keine Exception werfen.
//	b)	kompiliert nicht. Parent Klassen der angegebenen Exception im Prototypen sind nicht erlaubt.
//	c)	kompiliert und ist gültig. Die basismethode wird nicht überschrieben, sondern eine neue Signatur erstellt.
//	d)	kompiliert und ist gültig. FileNotFoundException extends IOException
//	e)	kompilert nicht. IOException ist eine checked Exception, 
//		RuntimeException ist die Basisklasse aller unchecked Exceptions.