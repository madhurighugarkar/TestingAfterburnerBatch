package conditionalStatment;

import java.util.Scanner;

public class RainbowColourProgram {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int value= ");
		int a=sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("Violet");
			break;
		case 2:
			System.out.println("Indigo");
			break;
		case 3:
			System.out.println("Blue");
			break;
		case 4:
			System.out.println("Green");
			break;
		case 5:
			System.out.println("Yellow");
			break;
		case 6:
			System.out.println("Orange");
			break;
		case 7:
			System.out.println("Red");
			break;
			
			default:
				
		    System.out.println("You entered wrong");

	}
}
	}

