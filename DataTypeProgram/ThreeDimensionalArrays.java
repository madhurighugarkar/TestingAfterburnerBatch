package dataTypeProgram;

public class ThreeDimensionalArrays {

     	public static void main(String[] args) {
	//2//3//4
		int arr [][][] = { {{1,2,3,4,5},{12,23,34,45} ,  {56,67,78,89},{21,32,43,54}  ,   {65,76,87,98},{22,44,55,66}} };
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				for (int k = 0; k < arr[i][j].length; k++) {
					
					
					System.out.println(arr[i][j][k]  + "  ");
					
				}
			System.out.println();
			
			}
			
		}
	}

}
