package day06.misc;

import java.util.*;

public class CollectionFrequency {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();
		list.add("cse");
		list.add("cse");
		list.add("eee");
		int cnt = Collections.frequency(list, "cse");
		System.out.println(cnt);

	}

}
