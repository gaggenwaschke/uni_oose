import java.lang.RuntimeException;

public class NumberTooBigException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NumberTooBigException()
	{
		super("The given number was too big");
	}
}
