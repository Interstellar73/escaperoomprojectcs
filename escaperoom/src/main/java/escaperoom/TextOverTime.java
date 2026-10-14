package escaperoom;

public class TextOverTime {
    public static void textOverTime(String text){
        for (char character : text.toCharArray()){
            System.out.print(character);
            try {
                Thread.sleep(75L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Don't interrupt the effect.");
            }
        }
        System.out.println();
        try {
            Thread.sleep(75L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Don't interrupt the effect.");
        }
    }
}
