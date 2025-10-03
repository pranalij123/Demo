package Collection.ApplicationBasedQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
	     List<Integer> numbers = Arrays.asList(10, 20, 5, 35, 15);

	        int max = Collections.max(numbers);
	        int min = Collections.min(numbers);

	        System.out.println("Max: " + max);
	        System.out.println("Min: " + min);

	}

}
