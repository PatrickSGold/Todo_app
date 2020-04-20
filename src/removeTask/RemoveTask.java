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

        System.out.println(database);
        System.out.print("Which task would you like to remove? Enter key number: ");
        return input.nextInt();
    }
}
