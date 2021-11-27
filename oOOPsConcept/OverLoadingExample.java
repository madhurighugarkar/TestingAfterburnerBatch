package oOOPsConcept;

public class OverLoadingExample {


		   public static void addition() {
	    	   System.out.println("Addition method without parameter");
	       }
	       public static void addition(int a) {
	    	   System.out.println("Addition method with int parameter");
	       }
	       public static void addition(int a, float b) {
	    	   System.out.println("Addition method with int and float parameter");
	       }
	       public static void addition(float b, int a) {
	    	   System.out.println("Addition method with float and int parameter");
	       }
	 	  public static void main(String[] args) {
			addition(5);

		}

	}



