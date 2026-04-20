package util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {

    // hash password before saving
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // check password during login
    public static boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
    public static void main(String[] args) {
        String hashed = PasswordUtil.hashPassword("1234");
    
        System.out.println("Hashed: " + hashed);
    
        boolean match = PasswordUtil.checkPassword("1234", hashed);
        System.out.println("Match: " + match);
    }
}