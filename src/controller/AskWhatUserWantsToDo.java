package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AskWhatUserWantsToDo {
    Scanner input = new Scanner(System.in);

    int keyNumber;

    public int askWhatUserWantsToDo() {

        try {
            System.out.println("What do you want to do? ");
            System.out.println("1: Add task");
            System.out.println("2: Remove task");
            System.out.println("3: Show current tasks");
            System.out.println("4: Modify a task");
            System.out.println("5: Exit");

            keyNumber = input.nextInt();

        }
        catch (InputMismatchException e) {
            System.out.println("Sorry, wrong input. Try again.");
            askWhatUserWantsToDo();
        }

        return keyNumber;
    }

 /*  private void checkInput() {
       if (keyNumber <= 0 || keyNumber > 5) {
           System.out.println("Sorry, wrong input. Try again.");
           askWhatUserWantsToDo();
       }

   }    */
}
