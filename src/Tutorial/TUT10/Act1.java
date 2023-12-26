package Tutorial.TUT10;

import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            menu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Adding a new item...");
                    break;
                case 2:
                    System.out.println("Listing all items...");
                    break;
                case 3:
                    System.out.println("Editing an item...");
                    break;
                case 4:
                    System.out.println("Removing an item...");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
    }

    public static void menu() {
        System.out.println("[1] Add item");
        System.out.println("[2] Item list");
        System.out.println("[3] Edit an item");
        System.out.println("[4] Remove an item");
        System.out.println("[5] Quit");
        System.out.print("Choose an option: ");
    }
}
