package com.example.finance.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.security.SecureRandom;
import java.time.LocalDate;

@Data
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;
    private String name;
    private Boolean active;
    private String addressProof;
    private String adharDetails;
    private Integer age;
    private String area;
    private String city;
    private Long companyId;
    private LocalDate created;
    private String createdBy;
    private String customerType;
    private String district;
    private String mobileNumber;
    private String occupation;
    private String panDetails;
    private String pincode;
    private Integer score;
    private String state;

    // Additional method to generate a unique ID
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int LETTER_COUNT = 4;
    private static final int DIGIT_COUNT = 5;
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomID() {
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < LETTER_COUNT; i++) {
            id.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        for (int i = 0; i < DIGIT_COUNT; i++) {
            id.append(random.nextInt(10));
        }
        return id.toString();
    }
}
