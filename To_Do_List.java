package asish.internship.TechnoInternship;

import java.util.ArrayList;
import java.util.Scanner;

public class To_Do_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> tasks = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println(" 1. Add task\n 2. Remove task\n 3. View tasks\n 4. Exit");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume the newline

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the task:");
	                    String task = scanner.nextLine();
	                    tasks.add(task);
	                    System.out.println("Task added.");
	                    break;

	                case 2:
	                    System.out.println("Enter the index of the task to remove:");
	                    int index = scanner.nextInt();
	                    scanner.nextLine();  // Consume the newline

	                    if (index >= 0 && index < tasks.size()) {
	                        String removedTask = tasks.remove(index);
	                        System.out.println("Task removed: " + removedTask);
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                    break;

	                case 3:
	                    System.out.println("Tasks:");
	                    for (int i = 0; i < tasks.size(); i++) {
	                        System.out.println(i + ". " + tasks.get(i));
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting program.");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }

	}

}
