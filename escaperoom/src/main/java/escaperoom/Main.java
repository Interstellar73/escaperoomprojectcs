package escaperoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Intro.runIntro();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hint. all keys will be prefaced with a number follwed by a dash, followed by the key. They will look something like this:");
        System.out.println("1 - 0123456789abcdef");
        System.out.println("Type 'help' for a list of commands");
        String initResponse = "";
        while (!Key.correctkey){ // game loop
            System.out.print("Enter your command: ");
            initResponse = scan.nextLine();
            String response = initResponse.toLowerCase();
            switch (response) {
                case "help":
                    FileSystem.help();
                    break;
                case "list":
                    FileSystem.list();
                    break;
                case "run":
                    FileSystem.run();
                    break;
                case "open":
                    FileSystem.open();
                    break;
                default:
                    System.out.println("That's not a valid command. Try again.");
                    break;
            }
        }
        scan.close();
    }
}