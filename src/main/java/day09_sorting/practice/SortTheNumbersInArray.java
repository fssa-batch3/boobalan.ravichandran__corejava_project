package day09_sorting.practice;

import java.util.*;

public class SortTheNumbersInArray {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(8);
		numbers.add(9);
		numbers.add(45);
		numbers.add(12);
		numbers.add(1);
		Collections.sort(numbers);

		System.out.println("After Sort:" + numbers);

	}

}
