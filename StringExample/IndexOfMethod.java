package stringExample;

public class IndexOfMethod {


		public static void main(String[] args) {
			String str=new String("Selenium Java Webdriver");
			String str1=new String("Selenium");
			
			//endswith() Method
	        boolean ends=str.endsWith("r");
	        System.out.println(ends);
	        
	        //equal() Method
	        boolean equal=str.equals(str1);
	        System.out.println(equal);
	        
	        //equalIsIgnoreCase() Method
	        boolean equal1=str.equalsIgnoreCase(str1);
	        System.out.println(equal1);
	        
	        //indexof() Method
	        int index=str.indexOf('e');
	        System.out.println(index);
	        
	        int in=str.indexOf("Selenium");
	        System.out.println(in);
	        
	        int index1=str.indexOf('e',2);
	        System.out.println(index1);
	        
	        int index2=str.indexOf("Selenium",1);
	        System.out.println(index2);
	        
		}

	}



	
