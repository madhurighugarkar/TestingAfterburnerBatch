package controlStatment;

public class BreakStatement {

	public static void main(String[] args) {
		
		int arr[]= {2,7,6,9,8,5};
		for(int i : arr)
		{
			if(i==8)
			{
				break;
			}
			System.out.println(i);
		}

	}

}
