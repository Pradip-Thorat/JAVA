package ExceptionHandling;

public class NegativeNumbersException extends RuntimeException {
	
	public NegativeNumbersException()
	{
		super();
	}
	
	public NegativeNumbersException(String message)
	{
		super(message);
	}

}
