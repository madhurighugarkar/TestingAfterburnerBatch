package stringExample;

public class ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i love my india";
		str=" "+str;
		String capital=" ";
		for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i)==' ') {
		capital=capital+" ";
		char y=str.charAt(i+1);
		capital=capital+Character.toUpperCase(y);
		i++;
		}
		else{
		capital=capital+str.charAt(i);
		}
		}
		System.out.println(capital);
		
	}


	}


