package introductionToClass;

import java.util.Arrays;

public class ArrayClass {


	public static void main(String[] args) {
		// CopyOfMethod
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println();
	
		int arr2[] = Arrays.copyOf(arr, 5);
		for(int i = 0; i<arr2.length; i++)
			System.out.println(arr2[i]);
		
	
       //FILL METHOD
		Arrays.fill(arr,1);
		for(int i = 0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		//TOSTRING METHOD
		int[] a1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(a1));


	}

}
