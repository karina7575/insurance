package com.javacademy.insurance.calc_services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Japan")
public class CalcJapanServiceConfig {

    @Bean
    public InsuranceCalcJapanService insuranceCalcJapanService(){
        return new InsuranceCalcJapanService();
    }
}
