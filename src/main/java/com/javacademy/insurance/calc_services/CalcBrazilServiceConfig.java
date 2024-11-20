package com.javacademy.insurance.calc_services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Brazil")
public class CalcBrazilServiceConfig {

    @Bean
    public InsuranceCalcBrazilService insurancecalcBrazilService(){
        return new InsuranceCalcBrazilService();
    }
}
