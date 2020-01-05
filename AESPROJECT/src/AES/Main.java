package AES;


public class Main {

	
	
	
	public static void main(String args[]) throws Exception {
		Aesalgo aalgo = new Aesalgo("vinayvinayvinayq");
		String s = "my name is vinay";
		System.out.println("Original text is "+s );
		String encryptedtext = aalgo.encrypt(s);
		System.out.println("encrypted text is "+encryptedtext );
		String decryptedtext = aalgo.decrypt(encryptedtext);
		
		System.out.println("decryptedtext text is "+decryptedtext );
		
		
	}
}
