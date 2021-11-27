package exceptionAndExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsMethod {

			

		public static void main(String[] args) throws FileNotFoundException {
			
			File file=new File("C:\\Users\\Administrator\\OneDrive\\Documents\\Madhuri Document");
			
			FileInputStream fis=new FileInputStream(file);

		}
		public static void m2() throws FileNotFoundException{
			m1();
			

	}
		private static void m1() throws FileNotFoundException {
			
			m2();
		}
	

	}


