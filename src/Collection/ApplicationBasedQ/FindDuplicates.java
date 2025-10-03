package Collection.ApplicationBasedQ;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		  int[] arr = {1, 2, 3, 1, 2, 4};

	        Set<Integer> set = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();

	        for (int num : arr) {
	            if (!set.add(num)) {
	                duplicates.add(num);
	            }
	        }

	        System.out.println("Duplicates: " + duplicates);
	}

}
