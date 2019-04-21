
public class Main {
    public static void main(String args[]) {
        String input = "Implementing Strategy Pattern";
        Context context = new Context();
        // MD5 Hashing Strategy
        context.setCurrentStrategy(new MD5Hash());
        System.out.println("MD5 hash of String \"" + input + "\" is: " + context.doHash(input));
        
        // SHA256 Hashing Strategy 
        context.setCurrentStrategy(new SHA256Hash());
        System.out.println("SHA256 hash of String \"" + input + "\" is: " + context.doHash(input));
    }
}