import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Scanner sc) {

        String description;

        while (true) {

            System.out.print("Enter task description: ");

            description = sc.nextLine().trim();

            if (!description.isEmpty()) {

                break;

            }

            System.out.println("Error! Task description cannot be empty.");

        }

        Task task = new Task(description);

        tasks.add(task);

        System.out.println("Task added successfully!");
    }


    public void viewTasks() {

        if (tasks.isEmpty()) {

            System.out.println("No tasks available.");

            return;

        }

        System.out.println("\n==============================");

        System.out.println("          TASK LIST");

        System.out.println("==============================");

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println(
                            (i + 1) + ". "
                            + tasks.get(i).getDescription()
                            + " ["
                            + tasks.get(i).getStatus()
                            + "]");
        }
    }

    public void updateTaskStatus(Scanner sc) {

        if (tasks.isEmpty()) {

            System.out.println("No tasks available.");

            return;

        }

        viewTasks();

        System.out.print("\nEnter task number: ");

        try {

            int index = Integer.parseInt(sc.nextLine());

            if (!isValidIndex(index)) {

                System.out.println("Invalid task number.");

                return;

            }

            Task task = tasks.get(index - 1);

            if (task.getStatus().equals("Pending")) {

                task.setStatus("Completed");

            } else {

                task.setStatus("Pending");

            }

            System.out.println("Task status updated successfully!");

        } catch (NumberFormatException e) {

            System.out.println("Please enter a valid number.");

        }

    }
    public void deleteTask(Scanner sc) {

        if (tasks.isEmpty()) {

            System.out.println("No tasks available.");

            return;

        }

        viewTasks();

        System.out.print("\nEnter task number to delete: ");

        try {

            int index = Integer.parseInt(sc.nextLine());

            if (!isValidIndex(index)) {

                System.out.println("Invalid task number.");

                return;

            }

            tasks.remove(index - 1);

            System.out.println("Task deleted successfully!");

        } catch (NumberFormatException e) {

            System.out.println("Please enter a valid number.");

        }
    }

    private boolean isValidIndex(int index) {

        return index >= 1 && index <= tasks.size();

    }

    public void showMenu() {

        System.out.println("\n==============================");

        System.out.println("        TO-DO LIST APP");

        System.out.println("==============================");

        System.out.println("1. Add Task");

        System.out.println("2. View Tasks");

        System.out.println("3. Update Task Status");

        System.out.println("4. Delete Task");

        System.out.println("5. Exit");

        System.out.println("==============================");

        System.out.print("Enter your choice: ");

    }

}

