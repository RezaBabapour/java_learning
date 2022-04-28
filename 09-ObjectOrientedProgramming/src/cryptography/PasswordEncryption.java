package cryptography;

public class PasswordEncryption {
    public static String encryptPassword(String password) {
        String encryptedPassword = "";
        String[] pwd = password.split("");
        for (int i = 0; i < pwd.length; i++) {
            encryptedPassword += (pwd[i] + i);
        }
        return encryptedPassword;
    }
}
