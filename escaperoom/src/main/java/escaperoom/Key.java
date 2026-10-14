package escaperoom;

public class Key {
    public static boolean correctkey = false;
    private static final String hashkey = "e3f746c73698d106ef93c0e8deb28f7a28477ee5bd18441eb88bf977d27ea02b";
    public static void key(String key){
        System.out.println("Running keyinput.exe with key "+ key +".");
        TextOverTime.textOverTime("Checking...");
        if (key.equals(hashkey)){
            System.out.println("KEY ACCEPTED. YOU BEAT THE ESCAPE ROOM. HAVE A GOOD DAY.");
            System.exit(0);
        } else if(key.length() != 64){
            System.out.println("KEY REJECTED. 64 CHARACTERS EXPECTED (RECIVED "+key.length()+").");
        }else{
            System.out.println("KEY REJECTED. CHECK SPELLING AND TRY AGAIN.");
            System.out.println("CLOSING KEYINPUT.");
        }
    }
}
