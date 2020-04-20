package removeTask;

import java.util.Map;
import java.util.Scanner;

public interface RemoveTaskInterfact {
    Scanner input = new Scanner(System.in);

    default Integer askWhatTaskToBeRemoved(Map<Integer, String> database) {
        Integer taskToBeRemoved;
        System.out.println(database);
        System.out.print("Which task would you like to remove? Enter key number: ");
        taskToBeRemoved = input.nextInt();
        return taskToBeRemoved;
    }

    void removeTaskFromDatabase(Map<Integer, String> database);
}
