package exceptionAndExceptionHandling;

public class CheckedExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		
		
			int i = 5;
			while(i<=5) {
				System.out.println(i++);
				Thread.sleep(5000);
	}

	}
}

//The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
//For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

