package controlStatment;

public class SingleDimensionalArrayWithWhileLoop {

	public static void main(String[] args) {
		
		char vowels[] = {'f','y', 'k', 'd', 's', 'p'};
		
		int index = 0;
		int size = vowels.length;
		while(index < size) {
			System.out.println(vowels[index]);
			index++;
		}
	}

}
