package sortedExample;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<String> set = new TreeSet<String>();
		
		set.add("madhuri");
		set.add("adhuri");
		set.add("madhuri");
		set.add("dhuri");
		
		System.out.println(set);
		System.out.println("First = "+set.first());
		System.out.println("Last = "+set.last());
		
		SortedSet<String> set1 = set.headSet("adhuri");
		System.out.println("Head Set = "+set1);
		
		//set1 = set.subSet("madhuri" , "dhuri");
	//	System.out.println("Sub set = " +set1);
		

		set1 = set.tailSet("madhuri");
		System.out.println("Tail set = " +set1);



		
	}

}
