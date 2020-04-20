package modifyTask;

import java.util.Map;
import java.util.Scanner;

public class ModifyTask implements modifyTaskInterface {

    public void modifyTask(Map<Integer, String> database) {
        database.replace(askWhatTaskToBeModified(database), newTask());
    }

    private String newTask() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the new task: ");
        return input.nextLine();
    }


}
