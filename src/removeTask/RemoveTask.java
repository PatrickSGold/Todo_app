package removeTask;

import java.util.Map;
import java.util.Scanner;

public class RemoveTask implements RemoveTaskInterfact {
    Scanner input = new Scanner(System.in);

    @Override
    public void removeTaskFromDatabase(Map<Integer, String> database) {
        database.remove(askWhatTaskToBeRemoved(database));
    }
}
