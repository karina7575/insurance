package com.javacademy.insurance.calc_services;

import com.javacademy.insurance.contract_components.TypeOfInsurance;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class InsuranceCalcJapanService implements InsuranceCalcService{
    private static final BigDecimal ROBBERY_COEFFICIENT_JAPAN = BigDecimal.valueOf(0.01);
    private static final BigDecimal ROBBERY_ADD_JAPAN = BigDecimal.valueOf(10_000);
    private static final BigDecimal HEALTH_COEFFICIENT_JAPAN = BigDecimal.valueOf(0.015);
    private static final BigDecimal HEALTH_ADD_JAPAN = BigDecimal.valueOf(12_000);
    @Override
    public BigDecimal insuranceCost(BigDecimal coverageAmount, TypeOfInsurance typeOfInsurance) {
        switch(typeOfInsurance) {
            case ROBBERY_PROTECTION:
                return coverageAmount.subtract(ROBBERY_COEFFICIENT_JAPAN).add(ROBBERY_ADD_JAPAN);
            case HEALTH_INSURANCE:
                return coverageAmount.subtract(HEALTH_COEFFICIENT_JAPAN).add(HEALTH_ADD_JAPAN);
            default:
                return null;
        }
    }
}
