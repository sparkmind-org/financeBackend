package com.example.finance.config;

import com.example.finance.listener.IdGenerationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
public class MongoConfig {

    @Bean
    public IdGenerationListener idGenerationListener() {
        return new IdGenerationListener();
    }
}
