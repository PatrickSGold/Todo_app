package removeTask;

import java.util.Map;
import java.util.Scanner;

public class RemoveTask {
    Scanner input = new Scanner(System.in);

    public void removeTaskFromDatabase(Map<Integer, String> database) {
        database.remove(askWhatTaskToBeRemoved(database));
    }

    public Integer askWhatTaskToBeRemoved(Map<Integer, String> database) {
        Scanner input = new Scanner(System.in);
        Integer taskNumber = 0;

        try {
            System.out.println(database);
            System.out.print("Which task would you like to remove? Enter key number: ");
            taskNumber = input.nextInt();

        }
        catch (Exception e) {
            System.out.println("Wrong input. Task does not exist. Try again.");
            // start over somehow
        }
        return taskNumber;
    }
}
