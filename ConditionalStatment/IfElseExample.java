package conditionalStatment;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=14;  //integer data type
		if(number%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}

		
		char c = 'a';  //char data type
		
		if(c ==  'h' || c == 'j' || c == 'k') {
			System.out.println(c+"  is vowels char");
		}else {
			System.out.println(c+"  is not vowels char");
					
		}
		
	}

}
