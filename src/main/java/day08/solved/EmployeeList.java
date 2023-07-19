package day08.solved;

import java.util.*;

public class EmployeeList {
	public static void main(String[] args) {
		HashMap<String, List<String>> employeeMap = new HashMap<>();

		addEmployee(employeeMap, "HR", "Ram");
		addEmployee(employeeMap, "HR", "Suresh");
		addEmployee(employeeMap, "IT", "Basker");
		addEmployee(employeeMap, "IT", "Joseph");
		addEmployee(employeeMap, "Admin", "Sundar");

		for (Map.Entry<String, List<String>> entry : employeeMap.entrySet()) {
			String deptName = entry.getKey();
			List<String> employees = entry.getValue();

			System.out.println(deptName + ": " + String.join(", ", employees));
		}
	}

	public static void addEmployee(HashMap<String, List<String>> employeeMap, String deptName, String employeeName) {
		if (!employeeMap.containsKey(deptName)) {
			employeeMap.put(deptName, new ArrayList<>());
		}
		employeeMap.get(deptName).add(employeeName);
	}
}
