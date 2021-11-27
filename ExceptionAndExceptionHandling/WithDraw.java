package exceptionAndExceptionHandling;

public class WithDraw {

		public static void main(String[] args) {
			
			int balance=5000;
			int withdrawAmount=5500;
			
			
			if(withdrawAmount<balance) {
				System.out.println("withdraw process started");
			}
			else {
			throw new InsufficientFundException("withdraw is greater than balance amount");

			}
		}

}
