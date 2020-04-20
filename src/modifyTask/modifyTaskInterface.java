package modifyTask;

import java.util.Map;
import java.util.Scanner;

public interface modifyTaskInterface {
    default Integer askWhatTaskToBeModified(Map<Integer, String> database) {
        Scanner input = new Scanner(System.in);

        System.out.println(database);
        System.out.println("Which of the above tasks do you wish to modify?");

        return input.nextInt();
    }
}
