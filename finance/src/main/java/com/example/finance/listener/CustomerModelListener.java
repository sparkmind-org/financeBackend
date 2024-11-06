package com.example.finance.listener;

import com.example.finance.entity.Customer;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomerModelListener extends AbstractMongoEventListener<Customer> {

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Customer> event) {
        Customer customer = event.getSource();
        // Generate ID only if it's not set
        if (customer.getId() == null) {
            customer.setId(Customer.generateRandomID());
        }
    }
}
