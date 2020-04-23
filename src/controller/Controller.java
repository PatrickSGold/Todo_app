package controller;

import addTask.AddTask;
import modifyTask.ModifyTask;
import removeTask.RemoveTask;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Controller {
    AddTask addTask = new AddTask();
    RemoveTask removeTask = new RemoveTask();
    AskWhatUserWantsToDo askUser = new AskWhatUserWantsToDo();
    ModifyTask modifyTask = new ModifyTask();

    public Map<Integer, String> database = new HashMap<>();

    public void run() {
        boolean stopRunning = false;

        while(!stopRunning) {
            switch (askUser.askWhatUserWantsToDo()) {
                case 1:
                    addTask.addToDatabase(database);
                    break;
                case 2:
                    removeTask.removeTaskFromDatabase(database);
                    break;
                case 3:
                    System.out.println(database);
                    break;
                case 4:
                    modifyTask.modifyTask(database);
                    break;
                case 5:
                    stopRunning = true;
                    break;
            }
        }
    }

}
