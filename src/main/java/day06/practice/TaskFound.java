package day06.practice;

import java.util.ArrayList;

public class TaskFound {
    public String taskName;
    public int priority;

    public TaskFound(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public static boolean findTaskByName(String name, ArrayList<TaskFound> tasks) {
        for (TaskFound task : tasks) {
            if (task.taskName.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<TaskFound> taskList = new ArrayList<>();
        TaskFound task1 = new TaskFound("Assignment", 2);
        TaskFound task2 = new TaskFound("chore", 5);
        TaskFound task3 = new TaskFound("duty", 1);
        TaskFound task4 = new TaskFound("stint", 4);

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        boolean givenTask = findTaskByName("duty", taskList);
        System.out.println("Find Task Status is: " + givenTask);
    }
}
