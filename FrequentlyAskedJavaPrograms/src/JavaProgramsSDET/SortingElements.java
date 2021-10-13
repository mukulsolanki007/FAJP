package JavaProgramsSDET;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {
	public static void main(String[] args) {
		
		//Logic 1
		
		int a[]= {30,50,20,10,60};
		
//		System.out.println("Array elements before sorting:" +Arrays.toString(a));
		
//		Arrays.parallelSort(a);
		
//		System.out.println("Array elements before sorting:" +Arrays.toString(a));

		//Logic 2
		
//		System.out.println("Array elements before sorting:" +Arrays.toString(a));
		
//		Arrays.sort(a);
	
//		System.out.println("Array elements before sorting:" +Arrays.toString(a));
	
		//Logic 3 --> Reverse or Descending order
		
		Integer b[]= {30,50,20,10,60};
		
		System.out.println("Array elements before sorting:" +Arrays.toString(b));
		
		Arrays.sort(b,Collections.reverseOrder());
	
		System.out.println("Array elements before sorting:" +Arrays.toString(b));
		
		
		
		
		
		
		
		
	}

}
