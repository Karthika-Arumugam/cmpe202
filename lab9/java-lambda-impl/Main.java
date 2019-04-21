import java.security.*;
import java.math.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		List <IHashStrategy> hashAlgo = null;
		String text = "implementation of Strategy Pattern with Lambda function";
		
		
	         //Strategy Lambda function
		hashAlgo = Arrays.asList(
			(input) -> {
				BigInteger num = null;
				String hash = null;
				try {
					MessageDigest md = MessageDigest.getInstance("MD5");
					byte[] messageDigest = md.digest(input.getBytes());
					num = new BigInteger(1, messageDigest);
					hash = num.toString(16);
					System.out.println("MD5 Hash for String [" + input + "] is : " + hash + "\n");
				}
				catch(Exception e) {
					System.out.println(e);
				}
			},
			(input) -> {
				BigInteger num = null;
				String hash = null;
				try {
					MessageDigest md = MessageDigest.getInstance("SHA-256");
					byte[] messageDigest = md.digest(input.getBytes());
					num = new BigInteger(1, messageDigest);
					hash = num.toString(16);
					System.out.println("MD5 Hash for String [" + input + "] is : " + hash + "\n");
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		);
		
		// Generating Hash using various strategies
		hashAlgo.forEach((txt) -> txt.doHash(text));
	}
}
