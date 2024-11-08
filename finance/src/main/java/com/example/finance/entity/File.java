package com.example.finance.entity;

import com.example.finance.util.RandomIdGenerator;
import lombok.Data;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "files")
public class File {

    @Id
    private String id;
    private String fileType;
    private String loanType;
    private Double loanAmount;
    private Double pigmiAmount;
    private Integer tenure;
    private Double interest;
    private LocalDate disbursementDate;
    private LocalDate fileclosingDate;
    private LocalDate collectionStartDate;
    private LocalDate collectionEndDate;
    private Double otherCharges;
    private String fileStatus;
    private List<PulsarProperties.Transaction> collections;


}
