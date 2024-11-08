package com.example.finance.entity;

import com.example.finance.util.RandomIdGenerator;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "financeCompanies")
public class FinanceCompany {

    @Id
    private String id;
    private String name;
    private String adminUsername;
    private String adminPassword;
    private Double capitalAmount;
    private Double loanAmount;
    private Double interestAmount;
    private Double totalIncome;
    private Double totalExpense;


}
