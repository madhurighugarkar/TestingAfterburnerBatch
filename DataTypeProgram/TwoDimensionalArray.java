package dataTypeProgram;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String StudentName[][]=new String[2][3];
		
		StudentName[0][0]="Madhuri"; 
		StudentName[0][1]="Mahii";
		StudentName[0][2]="Aadi";
		
		StudentName[1][0]="Sun";
		StudentName[1][1]="Moon";
		StudentName[1][2]="Star";
		
		System.out.println(StudentName[0][2]);
		System.out.println(StudentName[1][1]);
    	System.out.println(StudentName[1][2]);
		System.out.println(StudentName[0][1]);
		
		
		}

	}


