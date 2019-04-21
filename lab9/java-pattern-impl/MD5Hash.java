import java.security.*;
import java.math.*;

public class MD5Hash implements IHashStrategy
{
    
    public String hashSum(String input)
    {
        BigInteger num = null;
        String hash = null;
        try {
            MessageDigest mdMd5 = MessageDigest.getInstance("MD5");
            byte[] md = mdMd5.digest(input.getBytes());
            num = new BigInteger(1, md);    
            hash = num.toString(16);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return hash;
    }
}
