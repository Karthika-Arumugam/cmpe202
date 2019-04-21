import java.security.*;
import java.math.*;

public class SHA256Hash implements IHashStrategy
{
    /**
     * Calculates SHA256 sum of given string
     *
     * @param  plainText  String to be hashed
     * @return            The hashed string
     */
    public String hashSum(String input)
    {
        BigInteger num = null;
        String hash = null;
        try {
            MessageDigest mdSha = MessageDigest.getInstance("SHA-256");
            byte[] md = mdSha.digest(input.getBytes());
            num = new BigInteger(1, md);    
            hash = num.toString(16);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return hash;
    }
}
