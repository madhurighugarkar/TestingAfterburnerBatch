package exceptionAndExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyBlock {

	
		public static void main(String[] args) {
	        System.out.println("Statement 1");
	        try {
	        	String s=null;
	        	s.toLowerCase();
	            System.out.println("Statement 2");

	        }catch(NullPointerException e) {
	            System.out.println("Statement 3");

	        }finally {
	    		File file=new File("E:\\JAVA Notes 2021\\Break_Continue.pdf");
	            try {
	            	
	            	FileInputStream fis= new FileInputStream(file);
	            }catch (FileNotFoundException e) {
	            	e.printStackTrace();
	            }
	            System.out.println("Statement 4");

	        }
	        
	        System.out.println("Statement 5");


		}

	}


