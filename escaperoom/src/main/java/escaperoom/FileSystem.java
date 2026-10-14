package escaperoom;

import java.util.Scanner;

public class FileSystem {
    private static Scanner scan = new Scanner(System.in);
    private static String key1 = "1 - e3f746c73698d106";
    private static boolean key1Found = false;
    private static String key2 = "2 - ef93c0e8deb28f7a";
    private static boolean key2Found = false;
    private static String key3 = "3 - 28477ee5bd18441e";
    private static boolean key3Found = false;
    private static String key4 = "4 - b88bf977d27ea02b";
    private static boolean key4Found = false;
    private static String[] cat = {"           __..--''``---....___   _..._    __"," /// //_.-'    .-/\";  `        ``<._  ``.''_ `. / // /", "///_.-' _..--.'_    \\                    `( ) ) // //", "/ (_..-' // (< _     ;_..__               ; `' / ///", " / // // //  `-._,_)' // / ``--...____..-' /// / //"};
    private static String[] fileList = {"foundkeys.txt","puzzle1.exe","puzzle2.exe","puzzle3.exe","puzzle4.exe", "keyinput.exe", "cat.png", "keycracker.exe"};

    public static void list(){
        System.out.println("Found "+fileList.length+" files. Listing:");
        for (String f : fileList){
            System.out.println(f);
        }
    }
    public static void run(){
        System.out.println("What .exe file do you want to run? (input as 'xyz.exe')");
        String response = scan.nextLine();
        String lowsponse = response.toLowerCase();
        switch (lowsponse) {
            case "puzzle1.exe":
                puzzle1();
                break;
            case "puzzle2.exe":
                puzzle2();
                break;
            case "puzzle3.exe":
                puzzle3();
                break;
            case "puzzle4.exe":
                puzzle4();
                break;
            case "keyinput.exe":
                keyinput();
                break;
            case "keycracker.exe":
                keycracker();
                break;
            default:
                System.out.println("Error. No such program exists. Try again");
                break;
        }
    }
    public static void open(){
        System.out.println("What non .exe file do you want to open? (Avaliable files: foundkeys.txt, cat.png");
        String response = scan.nextLine();
        String lowsponse = response.toLowerCase();
        switch (lowsponse) {
            case "cat.png":
                for (String s : cat){
                    System.out.println(s);
                }
                break;
            case "foundkeys.txt":
                if (key1Found){
                    System.out.println(key1);
                }
                if (key2Found){
                    System.out.println(key2);
                }
                if (key3Found){
                    System.out.println(key3);
                }
                if (key4Found){
                    System.out.println(key4);
                }
                break;
            default:
                System.out.println("No keys found. use keycracker.exe to get keys.");
                break;
        }
    }

    public static void help(){
        System.out.println("List of commands: help, list, run, open.");
    }

    private static void puzzle1(){
        String pltxt = "emancipation";
        String cphtxt = "rznapvcngvba";
        String response = "";
        TextOverTime.textOverTime("You know, they say that this cipher was used by an aincent dictator to encode messages.");
        while (!response.equals(pltxt)) {
            System.out.println(cphtxt +". What could it mean, What could it mean? I think it might mean...");
            response = scan.nextLine();
        }
        TextOverTime.textOverTime("Great, you figured it out. Use the plaintext you found here in keycracker.exe to get the first key.");
    }

    private static void puzzle2(){
        String pltxt = "escape";
        String cphtxt = "rpblmr";
        String response = "";
        TextOverTime.textOverTime("Some people say that justice is the fightest pursuit. Me, I think it's LIBERTY.");
        while (!response.equals(pltxt)) {
            System.out.println(cphtxt + ". I wonder if someone pulled letters to the front of the alpahabet?");
            response = scan.nextLine();
        }
        TextOverTime.textOverTime("You got it. Use the plaintext you found here in keycracker.exe to get the second key.");
    }

    private static void puzzle3(){
        String pltxt = "LIBERTY";
        String cphtxt = "☹︎✋︎👌︎☜︎☼︎❄︎✡︎";
        String response = "";
        TextOverTime.textOverTime("Beware the man who speaks in hands, W.D. Gaster.");
        while (!response.equals(pltxt)) {
            System.out.println(cphtxt +". I wonder what W.D. could stand for?");
            response = scan.nextLine();
        }
        TextOverTime.textOverTime("You got it. Use the plaintext you found here in keycracker.exe to get the third key.");
    }

    private static void puzzle4(){
        String pltxt = "forty two";
        String cphtxt = "qwwxj bbs";
        String response = "";
        TextOverTime.textOverTime("This cipher was made by a fench man named Blaise de Vigenère.");
        while (!response.equals(pltxt)) {
            System.out.println(cphtxt + ". y'know, one number is considered the answer to life, the universe, and everything.");
            response = scan.nextLine();
            
        }
    }

    private static void keyinput(){
        System.out.println("Welcome to keyinput! Enter your key below.");
        String response = scan.nextLine();
        Key.key(response);
    }

    private static void keycracker(){
        System.out.println("Welcome to Keycracker v4.1.2!");
        System.out.println("Enter your key to crack: ");
        String response = scan.nextLine();
        TextOverTime.textOverTime("Cracking...");
        switch (response) {
            case "emancipation":
                System.out.println("Key cracked successfully.");
                System.out.println(key1);
                key1Found = true;
                break;
            case "escape":
                System.out.println("Key cracked successfully.");
                System.out.println(key2);
                key2Found = true;
                break;
            case "LIBERTY":
                System.out.println("Key cracked successfully.");
                System.out.println(key3);
                key3Found = true;
                break;
            case "forty two":
                System.out.println("Key cracked successfully.");
                System.out.println(key4);
                key4Found = true;
                break;
            
            default:
                break;
        }
    }
}
