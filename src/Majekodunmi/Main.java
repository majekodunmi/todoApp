package Majekodunmi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Majekodunmi.toDO toDoActivity = new Majekodunmi.toDO();


    public static void main(String[] args) {
        // write your code here

        boolean stop = false;
        int choice = 0;
        printWhatToDo();

        while (!stop) {
            System.out.println("********************************");
            System.out.println("What do you want to do: ");

            boolean choiceinput = scanner.hasNextInt();
            if (choiceinput) {
                choice = scanner.nextInt();;
                scanner.nextLine();

            } else {
                System.out.println("Invalid Option!!");
                scanner.nextLine();
            }

            switch (choice) {
                case 0:
                    printWhatToDo();
                case 1:
                    addActivity();
                    break;
                case 2:
                    toDoActivity.printList();
                    break;
                case 3:
                    modifyActivity();
                    break;
                case 4:
                    removeActivity();
                    break;
                 case 5:
                    stopApp();
                    stop = true;
                    break;
            }
        }


    }

    public static void stopApp() {
        System.out.println("Application terminated!");
    }

    public static void printWhatToDo() {
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To add an activity to the list.");
        System.out.println("\t2 - To print the list of Activities. ");
        System.out.println("\t3 - To modify an activity in the list.");
        System.out.println("\t4 - To remove an activity from the list.");
        System.out.println("\t5 - To stop the application.");
        System.out.println("************************************************************");
    }


    public static void addActivity() {
        System.out.println("\nPlease enter activity to do: ");
        toDoActivity.addActivity(scanner.nextLine());
    }

    public static void modifyActivity() {
        if (toDoActivity.getToDoList().isEmpty()) {
            System.out.println("You have " + toDoActivity.getToDoList().size() + " activties in your ToDO List.");
            System.out.println("There is nothing to modify.");
        } else {
            System.out.print("Current Activity Position to be Modified: ");

            boolean abc = scanner.hasNextInt();

            if (abc) {
                int position = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new Activity: ");
                String newActivity = scanner.nextLine();
                toDoActivity.modifyActivity(position, newActivity);
            } else {
                System.out.println("Invalid Activity Position!!");
                scanner.nextLine();
            }


        }
    }


    public static void removeActivity() {

        if (toDoActivity.getToDoList().isEmpty() ) {
            System.out.println("You have " + toDoActivity.getToDoList().size() + " activties in your ToDO List.");
            System.out.println("There is nothing to remove.");
        }

        else {
            System.out.print("Enter Activity number to be removed: ");
            int position = scanner.nextInt();
            toDoActivity.removeActivity(position - 1);
        }
    }

}

