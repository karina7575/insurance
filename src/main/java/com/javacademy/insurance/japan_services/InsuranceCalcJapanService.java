package com.javacademy.insurance.japan_services;

import com.javacademy.insurance.InsuranceCalcService;
import com.javacademy.insurance.brazil_services.CalcBrazilServiceProperty;
import com.javacademy.insurance.contract_components.InsuranceType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@RequiredArgsConstructor
@Component
@Profile("japan")
public class InsuranceCalcJapanService implements InsuranceCalcService {

    private static final BigDecimal ROBBERY_ADD_JAPAN = BigDecimal.valueOf(10_000);
    private static final BigDecimal HEALTH_ADD_JAPAN = BigDecimal.valueOf(12_000);
    private final CalcJapanServiceProperty property;

    @Override
    public BigDecimal insuranceCost(BigDecimal coverageAmount, InsuranceType typeOfInsurance) {
        switch(typeOfInsurance) {
            case ROBBERY_PROTECTION:
                return coverageAmount.multiply(property.getRobberyCoefficient()).add(ROBBERY_ADD_JAPAN);
            case HEALTH_INSURANCE:
                return coverageAmount.multiply(property.getHealthCoefficient()).add(HEALTH_ADD_JAPAN);
            default:
                return null;
        }
    }
}
