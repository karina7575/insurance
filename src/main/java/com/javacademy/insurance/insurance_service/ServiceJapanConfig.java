package com.javacademy.insurance.insurance_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Japan")
public class ServiceJapanConfig {

    @Bean
    public InsuranceServiceJapan insuranceServiceJapan() {
        return new InsuranceServiceJapan();
    }
}
