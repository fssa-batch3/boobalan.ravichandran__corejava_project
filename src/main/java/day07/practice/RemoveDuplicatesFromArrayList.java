package day07.practice;

import java.util.*;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(25);
		numbers.add(50);
		numbers.add(25);
		numbers.add(50);
		numbers.add(25);
		numbers.add(89);
		numbers.add(67);

		Set<Integer> setNumbers = new HashSet<Integer>(numbers);
		for (Integer num : setNumbers) {

			System.out.println(num);
		}

	}

}
