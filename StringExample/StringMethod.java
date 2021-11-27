package stringExample;

public class StringMethod {

    public static void main(String[] args) {
    	
			String str=new String("Selenium");
			String str1=new String("Selenium");
			
			//CharAt() Method
			//1st way
			char c=str.charAt(5);
	        System.out.println(c);
	        
	        //2nd way
	        System.out.println(str.charAt(0));
	        
	        //codepointAt() Method = it returns ASCII value of character
	        System.out.println(str1.codePointAt(1));
	        
	        //compare() Method
	        int compare=str.compareTo(str1);
	        System.out.println(compare);
	        
	        //compareToIgnoreCase() Method
	        int compare1=str.compareToIgnoreCase(str1);
	        System.out.println(compare1);
	        
	        //concat() Method
	        String S=str.concat("Webdriver");
	        System.out.println(S);
	        
	        //contain() Method
	        boolean contain=S.contains(str);
	        System.out.println(contain);
		}

	}


