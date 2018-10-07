package util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
public class Util {
    private static final char[] NUMERICS = "0123456789".toCharArray();
    private static final char[] ALPHA_NUMERICS = "ABCDEFGHILMNOPQRSTUVWYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();


    public static synchronized String generateNumeric() {
        int count = 6;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < count; ++i) {
            char c = NUMERICS[random.nextInt(NUMERICS.length)];
            sb.append(c);
        }

        return sb.toString();

    }


    public static synchronized String generateRandomString() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; ++i) {
            char c = ALPHA_NUMERICS[random.nextInt(ALPHA_NUMERICS.length)];
            sb.append(c);
        }

        return sb.toString();
    }


    public String encode(CharSequence rawPassword) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(rawPassword.toString().getBytes());
            byte messageDigest[] = digest.digest();

            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                StringBuilder h = new StringBuilder(Integer.toHexString(0xFF & aMessageDigest));
                while (h.length() < 2) {
                    h.insert(0, "0");
                }
                hexString.append(h);

            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
