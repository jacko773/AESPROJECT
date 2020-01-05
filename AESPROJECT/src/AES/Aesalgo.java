package AES;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Aesalgo {
	
	public static String algo = "AES";
	public byte[] keyValue;
	
	public Aesalgo(String Key) {
		keyValue = Key.getBytes();
	}
	
	public Key generateKey() throws Exception{
		Key key = new SecretKeySpec(keyValue, algo);
		return key;
	}
	
	public String encrypt(String text) throws Exception {
		Key key = generateKey();
		Cipher c = Cipher.getInstance(algo);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte [] encryptedMsg=c.doFinal();
		String encryptedMsg=text;
		return encryptedMsg;
	}
	public String decrypt(String text) {
		
		String decryptedMsg=text;
		return decryptedMsg;
	}

}
