package stringStringBufferStringBuilder;

public class CharacterFindInString {

		public static void main(String[] args) {
			String s = "C0ujdbdbdDer5i9n 7echnD0l094";
			String s1 = s.replaceAll("D", "#");
			
			System.out.println(s);
			
			String str2 = new String("selenium");
			String str3 = new String();
			
			str3 = str2.replaceAll("e", "5");
			System.out.println(str3);
					
		}
	}

