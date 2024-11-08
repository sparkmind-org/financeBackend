package com.example.finance.entity;

import com.example.finance.util.RandomIdGenerator;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;

@Data
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;
    private LocalDate date;
    private Double emiAmount;
    private Double collectedAmount;
    private Boolean collectedYN;




}
