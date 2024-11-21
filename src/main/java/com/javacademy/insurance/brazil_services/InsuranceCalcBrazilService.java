package com.javacademy.insurance.brazil_services;

import com.javacademy.insurance.InsuranceCalcService;
import com.javacademy.insurance.contract_components.InsuranceType;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@RequiredArgsConstructor
@Component
@Profile("brazil")
public class InsuranceCalcBrazilService implements InsuranceCalcService {
    private static final BigDecimal ROBBERY_ADD = BigDecimal.valueOf(300);
    private static final BigDecimal HEALTH_ADD = BigDecimal.valueOf(800);
    private final CalcBrazilServiceProperty property;

    @Override
    public BigDecimal insuranceCost(BigDecimal coverageAmount, InsuranceType typeOfInsurance) {
        switch(typeOfInsurance) {
            case ROBBERY_PROTECTION:
                return coverageAmount.multiply(property.getRobberyCoefficient()).add(ROBBERY_ADD);
            case HEALTH_INSURANCE:
                return coverageAmount.multiply(property.getHealthCoefficient()).add(HEALTH_ADD);
            default:
                return null;
        }
    }
}
