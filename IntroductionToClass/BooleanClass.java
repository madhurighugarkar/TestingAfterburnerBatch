package introductionToClass;

public class BooleanClass {

	public static void main(String[] args) {
		
		int a=5;
		int b=40;
		
		boolean result=Boolean.logicalOr(a>b, a<b);      //logicalOr method
		System.out.println(result);
		
	   
		boolean result1=Boolean.logicalOr(a>b, a<b);  //logicalAnd method
		System.out.println(result1);
		
		
		String s="true";                     //valueOf method
		boolean str=Boolean.valueOf(s);
		System.out.println(str);
		
		boolean b1=false;
		Boolean obj=b1;
		Boolean d=Boolean.valueOf(b1);
	}

	}


