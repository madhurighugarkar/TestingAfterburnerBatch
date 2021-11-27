package introductionToClass;

public class CharacterClass {

	public static void main(String[] args) {
	
		// charvalue() method
		Character ch=new Character('e');
        char c1=ch.charValue();
        
        //compare() method
        int compare=Character.compare('b', 'a');
        System.out.println(compare);
        
        //getnumericvalue() method
        char c='5';
        int a=c;
        System.out.println(a);
        int b=Character.getNumericValue(c);
        System.out.println(b);
        
        //iswhitespace() method OR isspacechar() method
        char c2= ' ';
        System.out.println(Character.isWhitespace(c2));
        System.out.println(Character.isSpaceChar(c2));
        
     	}


	}


