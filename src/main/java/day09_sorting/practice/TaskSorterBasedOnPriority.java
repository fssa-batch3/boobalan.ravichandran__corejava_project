package day09_sorting.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PriTask {
	private int id;
	private String name;
	private int priority;
	private LocalDate deadline;

	public PriTask(int priority, int id, String name, LocalDate deadline) {
		this.priority = priority;
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

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", priority=" + priority + ", deadline=" + deadline + "]";
	}
}

public class TaskSorterBasedOnPriority {
	public static void main(String[] args) {
		List<PriTask> taskList = new ArrayList<PriTask>();

		taskList.add(new PriTask(1, 3, "Coding", LocalDate.parse("2022-10-22")));
		taskList.add(new PriTask(3, 5, "Product Design", LocalDate.parse("2022-10-01")));
		taskList.add(new PriTask(4, 1, "Software Design", LocalDate.parse("2022-10-07")));
		taskList.add(new PriTask(4, 3, "Coding", LocalDate.parse("2022-10-22")));

		
		Collections.sort(taskList,Comparator.comparing(PriTask::getDeadline)
				.thenComparing(PriTask::getPriority));

	

		for (PriTask task : taskList) {
			System.out.println(task);
		}
	}
}
