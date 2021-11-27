package conditionalStatment;

import java.util.Scanner;
public class IfExample {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value = ");
		int a = sc.nextInt();
		
		if(a%2!=0)
		{
			System.out.println(a+ "is odd number");
		}
		
		sc.close();

	}

}
