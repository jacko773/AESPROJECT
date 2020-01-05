package AES;

import java.security.Key;
import java.util.Base64;

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
		byte [] encMsg=c.doFinal(text.getBytes());
		
		System.out.println("encmsg"+encMsg);
		String encryptedMsg = new String( Base64.getEncoder().encode(encMsg));
		return encryptedMsg;
	}
	public String decrypt(String text) throws Exception {
		System.out.println("passedstring for dec "+text);
		Key key = generateKey();
		Cipher c = Cipher.getInstance(algo);
		c.init(Cipher.DECRYPT_MODE, key);
		byte [] decMsgbase64 = Base64.getDecoder().decode(text);
		System.out.println("deccmsg 64"+decMsgbase64);
		byte [] decMsg=c.doFinal(decMsgbase64);
		String decryptedMsg = decMsg.toString();
		return decryptedMsg;
		
	}

}
