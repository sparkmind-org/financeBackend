package com.example.finance.entity;

import com.example.finance.util.RandomIdGenerator;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String role;
    private String userid;
    private String password;
    private String email;
    private String mobile;
    private String name;


}
