package day08.practice;

import java.util.*;

public class PrintCount {

	public static void main(String[] args) {
		HashMap<String, Integer> userList = new HashMap<String, Integer>();
		userList.put("Ram", userList.getOrDefault("Ram", 0) + 1);
		userList.put("Ram", userList.getOrDefault("Ram", 0) + 1);
		userList.put("Superman", userList.getOrDefault("Superman", 0) + 1);
		userList.put("Spider", userList.getOrDefault("Spider", 0) + 1);
		userList.put("Hello", userList.getOrDefault("Hello", 0) + 1);
		userList.put("Hey", userList.getOrDefault("Hey", 0) + 1);
		userList.put("Hey", userList.getOrDefault("Hey", 0) + 1);
		userList.put("Spider", userList.getOrDefault("Spider", 0) + 1);

		for (String deptName : userList.keySet()) {
			System.out.println(deptName + ": " + userList.get(deptName));
		}
	}
}
