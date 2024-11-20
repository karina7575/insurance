package com.javacademy.insurance.calc_services;

import com.javacademy.insurance.contract_components.TypeOfInsurance;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
public class InsuranceCalcBrazilService implements InsuranceCalcService {
    private static final BigDecimal ROBBERY_COEFFICIENT = BigDecimal.valueOf(0.05);
    private static final BigDecimal ROBBERY_ADD = BigDecimal.valueOf(300);
    private static final BigDecimal HEALTH_COEFFICIENT = BigDecimal.valueOf(0.03);
    private static final BigDecimal HEALTH_ADD = BigDecimal.valueOf(800);

    @Override
    public BigDecimal insuranceCost(BigDecimal coverageAmount, TypeOfInsurance typeOfInsurance) {
        switch(typeOfInsurance) {
            case ROBBERY_PROTECTION:
                return coverageAmount.subtract(ROBBERY_COEFFICIENT).add(ROBBERY_ADD);
            case HEALTH_INSURANCE:
                return coverageAmount.subtract(HEALTH_COEFFICIENT).add(HEALTH_ADD);
            default:
                return null;
        }
    }
}
