import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskManager manager = new TaskManager();

        int choice;

        while (true) {

            manager.showMenu();

            try {

                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        manager.addTask(sc);
                        break;

                    case 2:
                        manager.viewTasks();
                        break;

                    case 3:
                        manager.updateTaskStatus(sc);
                        break;

                    case 4:
                        manager.deleteTask(sc);
                        break;

                    case 5:
                        System.out.println("Thank you for using To-Do List App!");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid menu option.");
            }
        }
    }
}