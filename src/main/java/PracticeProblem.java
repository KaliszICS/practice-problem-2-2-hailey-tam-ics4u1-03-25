import java.util.*;
public class PracticeProblem {
	
	public static void main(String args[]) {
		System.out.println(compareSearch(new int[] {1, 2, 3, 4, 5, 6, 67, 8, 9, 230, 555, 786, 923, 1000, 1500}, 55));

	}
	
	public static int[] compareSearch(int[] array, int number){

		int index0 = 0; //loop counter for sequential loop

		for (int i = 0; i < array.length; i++){
			index0++;
			if (array[i] == number){
				i = array.length;
			}
		}
	 
		int low = 0;
		int high = array.length - 1;
		int mid;
	
		Arrays.sort(array);

		int index1 = 0;  //loop counter for binary loop
		int index = -1;

		while(low <= high){
			index1++;

			mid = (high +low) / 2;
			if (number == array[mid]){
				index = mid;
				low = high + 1;
			}
			else if (number > array[mid]){
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}

		 int intArray[] = {index0, index1};
		 return intArray;
	}

	public static int[] compareStringSearch(String[] array, String word){

		int index0 = 0; //loop counter for sequential loop

		for (int i = 0; i < array.length; i++){
			index0++;
			if (array[i].equals(word)){
				i = array.length;
			}
		}

		int index1 = 0; //loop counter for binary loop
		int index = -1;
		int low = 0;
		int high = array.length - 1;
		int mid;

		while (low <= high){
			index1++;
			mid = (high + low)/2;
			int compararssion = word.compareTo(array[mid]);
			if (compararssion == 0){
				index = mid;
				low = high + 1;
			}
			else if (compararssion > 0){
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		int intArray[] = {index0, index1};
		return intArray;
	}
}
