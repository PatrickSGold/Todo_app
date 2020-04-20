package modifyTask;

import java.util.Map;
import java.util.Scanner;

public class ModifyTask {

    public void modifyTask(Map<Integer, String> database) {
        database.replace(askWhatTaskToBeModified(database), newTask());
    }

    private String newTask() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the new task: ");
        return input.nextLine();
    }

    public Integer askWhatTaskToBeModified(Map<Integer, String> database) {
        Scanner input = new Scanner(System.in);

        System.out.println(database);
        System.out.println("Which of the above tasks do you wish to modify?");

        return input.nextInt();

    }
}
