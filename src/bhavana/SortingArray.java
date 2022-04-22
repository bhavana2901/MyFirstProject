package bhavana;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array1 = {1234,3456,6789,56789,54321};
		String[] my_array2 = {"Java","Sql","Html","C++","R"};
		System.out.println("Original numeric array :" +Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array :" + Arrays.toString(my_array1));
		System.out.println("Original string array :" +Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("Sorted string array :" + Arrays.toString(my_array2));
		

		

	}

}
