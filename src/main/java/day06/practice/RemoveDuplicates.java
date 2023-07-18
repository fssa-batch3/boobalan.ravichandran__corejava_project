package day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		Set<String> uniqueCities = new HashSet<>(cityList);
		List<String> uniqueCityList = new ArrayList<>(uniqueCities);

		System.out.println("Original List: " + cityList);
		System.out.println("Unique City List: " + uniqueCityList);
	}
}
