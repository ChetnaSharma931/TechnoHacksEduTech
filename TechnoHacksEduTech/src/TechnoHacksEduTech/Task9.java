package TechnoHacksEduTech;

import java.security.SecureRandom;
public class Task9 {
	private static final String LOWER_CHAR = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHAR = "!@#$%^&*()-_=+";

	public static void main(String[] args) {
		int length = 12; 
        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }

    static String generatePassword(int length) {
        SecureRandom ran = new SecureRandom();
        StringBuilder password = new StringBuilder();

        String allCharacters = LOWER_CHAR + UPPER_CHAR + DIGITS + SPECIAL_CHAR;

        for (int i = 0; i < length; i++) {
            int ranIndex = ran.nextInt(allCharacters.length());
            char ranChar = allCharacters.charAt(ranIndex);
            password.append(ranChar);
        }

        return password.toString();
    }


	}


