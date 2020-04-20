package addTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddTask implements AddTaskInterface {

    private int numberOfTasksInDB;

    @Override
    public void addToDatabase(Map<Integer, String> database) {
        database.put(++numberOfTasksInDB, askForTask());
    }

    public int getNumberOfTasksInDB() {
        return numberOfTasksInDB;
    }

    public void setNumberOfTasksInDB(int numberOfTasksInDB) {
        this.numberOfTasksInDB = numberOfTasksInDB;
    }

}
