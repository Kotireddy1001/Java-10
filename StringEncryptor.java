public class StringEncryptor {
    public static void main(String[] args) {
        String original = "HELLO";
        int key = 3;
        String encrypted = "", decrypted = "";

        for (char ch : original.toCharArray()) {
            encrypted += (char)(ch + key);  // Encryption
        }

        for (char ch : encrypted.toCharArray()) {
            decrypted += (char)(ch - key);  // Decryption
        }

        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
