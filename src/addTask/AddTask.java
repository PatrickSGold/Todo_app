package addTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddTask {

    private int numberOfTasksInDB = 0;

    public void addToDatabase(Map<Integer, String> database) {
        database.put(++numberOfTasksInDB, askForTask());
    }

    public String askForTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("What task would you like to add? ");
        return input.nextLine();
    }
}
