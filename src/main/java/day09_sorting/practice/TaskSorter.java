package day09_sorting.practice;

import java.time.LocalDate;

import java.util.*;

class Task {

	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	}
//	@Override
//	public int compareTo(PriTask othertask) {
//		
//		return this.getDeadline().compareTo(othertask.getDeadline());
//	}

}

public class TaskSorter {

	public static void main(String[] args) {
		List<Task> taskList = new ArrayList<Task>();

		taskList.add(new Task(3, "Coding", LocalDate.parse("2022-10-22")));
		taskList.add(new Task(5, "Product Design", LocalDate.parse("2022-10-01")));
		taskList.add(new Task(1, "Software Design", LocalDate.parse("2022-10-07")));
		taskList.add(new Task(3, "Coding", LocalDate.parse("2022-10-22")));

		Collections.sort(taskList, Comparator.comparing(Task::getDeadline));

		for (Task task : taskList) {
			System.out.println(task);
		}

	}

}
