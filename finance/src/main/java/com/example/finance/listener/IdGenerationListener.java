package com.example.finance.listener;

import com.example.finance.entity.*;
import com.example.finance.util.RandomIdGenerator;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class IdGenerationListener extends AbstractMongoEventListener<Object> {

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Object> event) {
        Object source = event.getSource();

        if (source instanceof FinanceCompany) {
            FinanceCompany company = (FinanceCompany) source;
            if (company.getId() == null) {
                company.setId(RandomIdGenerator.generateId("COM"));
            }
        } else if (source instanceof File) {
            File file = (File) source;
            if (file.getId() == null) {
                file.setId(RandomIdGenerator.generateId("FIL"));
            }
        } else if (source instanceof Transaction) {
            Transaction transaction = (Transaction) source;
            if (transaction.getId() == null) {
                transaction.setId(RandomIdGenerator.generateId("TRA"));
            }
        } else if (source instanceof Customer) {
            Customer customer = (Customer) source;
            if (customer.getId() == null) {
                customer.setId(RandomIdGenerator.generateId("CUS"));
            }
        } else if (source instanceof User) {
            User user = (User) source;
            if (user.getId() == null) {
                user.setId(RandomIdGenerator.generateId("USE"));
            }
        }
    }
}
