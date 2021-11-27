package exceptionAndExceptionHandling;

public class AgeIsNotValidException extends RuntimeException {

	public AgeIsNotValidException(String age) {
		
		super(age);
  	
	}

}
