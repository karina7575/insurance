package com.javacademy.insurance;

import com.javacademy.insurance.contract_components.InsuranceType;

import java.math.BigDecimal;

public interface InsuranceCalcService {

    BigDecimal insuranceCost(BigDecimal coverageAmount, InsuranceType typeOfInsurance);
}
