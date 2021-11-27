package exceptionAndExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchExample {


	private static void m1() {
		File file=new File("\"D:\\StringNotes\\StringNotes.rtf\"");
        System.out.println("Statement 1");
        try {
        	    //Risky Code
        	FileInputStream fis= new FileInputStream(file);
        	
        }catch (FileNotFoundException e) {
        	   //handlig code
        }
        System.out.println("Statement 2");

	}
	public static void main(String[] args) {
		
		m1();

	}
}
