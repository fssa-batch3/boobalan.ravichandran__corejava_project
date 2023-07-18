package day06.practice;

import java.util.*;

public class Task {
	public String taskName;
	public int priority;

	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();
		Task task1 = new Task("Assignment", 2);
		Task task2 = new Task("chore", 5);
		Task task3 = new Task("duty", 1);
		Task task4 = new Task("stint", 4);

		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);

		for (Task task : taskList) {
			System.out.println("Task Name: " + task.getTaskName());
			System.out.println("Priority: " + task.getPriority());
		}

	}

}
