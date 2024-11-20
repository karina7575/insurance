package com.javacademy.insurance.insurance_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Brazil")
public class ServiceBrazilConfig {

    @Bean
    public InsuranceServiceBrazil insuranceServiceBrazil() {
        return new InsuranceServiceBrazil();
    }
}
