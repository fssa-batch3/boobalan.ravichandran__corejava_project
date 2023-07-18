package day06.misc;

import java.util.*;

public class CollectionsShuffle {

	public static void main(String[] args) {
		String[] args1 = new String[3];
		args1[0] = "CSE";
		args1[1] = "EEE";
		args1[2] = "MECH";
		args1[2] = "ECE";
		args1[2] = "PCB";

		List<String> list = Arrays.asList(args1);
		Collections.shuffle(list);
		System.out.println(list);
	}
}
