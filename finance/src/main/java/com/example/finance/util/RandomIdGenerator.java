package com.example.finance.util;

import java.security.SecureRandom;

public class RandomIdGenerator {

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public static String generateId(String prefix) {
        StringBuilder id = new StringBuilder(prefix);

        // Add two random characters
        for (int i = 0; i < 2; i++) {
            id.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        // Add two random digits
        for (int i = 0; i < 5; i++) {
            id.append(RANDOM.nextInt(10));
        }

        return id.toString();
    }
}
