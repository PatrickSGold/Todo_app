package addTask;

import java.util.Map;
import java.util.Scanner;

public interface AddTaskInterface {
    default String askForTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("What task would you like to add? ");
        return input.nextLine();
    }

    void addToDatabase(Map<Integer, String> database);
}
