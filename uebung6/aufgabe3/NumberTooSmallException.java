
public class NumberTooSmallException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NumberTooSmallException() {
		super("The given number is too small");
	}
}
