package escaperoom;

import java.util.Scanner;

public class Intro {
    private static Scanner scan = new Scanner(System.in);
    public static void runIntro(){

        TextOverTime.textOverTime("Hello.");
        TextOverTime.textOverTime("My name is Atlas.");
        TextOverTime.textOverTime("It seems you have run into a predicament.");
        TextOverTime.textOverTime("You're stuck here, yes?");
        TextOverTime.textOverTime("Don't bother responding, I know what's going on.");
        System.out.println();
        TextOverTime.textOverTime("You know what? I'll help you. Here's the key to escape.");
        TextOverTime.textOverTime("It's 'Freedom'. You're welcome.");
        TextOverTime.textOverTime("Go on, try it.");
        String response = "";
        response = scan.nextLine();
        Key.key(response);
        TextOverTime.textOverTime("Didn't wok? Odd. Maybe there's something else that has to be done.");
        TextOverTime.textOverTime("Poke around in the files here. Maybe there will be something that points you in the right direction.");
        System.out.println();
        System.out.println("User 'Atlas' has disconnected.");
        System.out.println();
    }
}
