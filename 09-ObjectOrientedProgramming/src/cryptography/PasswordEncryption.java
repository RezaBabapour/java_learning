package cryptography;

import java.util.Random;

public class PasswordEncryption {
    private static final String alphabet = "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ0123456789";

    public static String encodePassword(String password) {
        return generateSalt(password.length()) + encryptPassword(password);
    }

    public static boolean checkPassword(String loginPassword, String storedPassword) {
        return storedPassword.contains(encryptPassword(loginPassword));
    }

    private static String encryptPassword(String password) {
        String encryptedPassword = "";
        String[] pwd = password.split("");
        for (int i = 0; i < pwd.length; i++) {
            encryptedPassword += (pwd[i] + i);
        }
        return encryptedPassword;
    }

    private static String generateSalt(int length) {
        Random rand = new Random();
        String salt = "";
        for (int i = 0; i < length; i++) {
            salt += alphabet.charAt(rand.nextInt(alphabet.length()));
        }
        return salt;
    }
}
