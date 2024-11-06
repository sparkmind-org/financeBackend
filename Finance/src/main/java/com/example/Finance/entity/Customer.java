package com.example.Finance.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
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

    // Getters and Setters for all fields
}