package exceptionAndExceptionHandling;

import java.util.Scanner;

public class VoterAge {

		public static void main(String[] args) {
	        int age;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your age=");
	        age = sc.nextInt();
	        if (age >= 18)
	        {
	            System.out.println("You are eligible for vote.");
	        }
	        else
	        {
	            throw new AgeIsNotValidException("You are not eligible for vote.");

		}
	        
    }
		
}


