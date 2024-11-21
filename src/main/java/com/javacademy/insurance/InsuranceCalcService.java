package com.javacademy.insurance;

import com.javacademy.insurance.contract_components.InsuranceType;

import java.math.BigDecimal;

public interface InsuranceCalcService {

    public BigDecimal insuranceCost(BigDecimal coverageAmount, InsuranceType typeOfInsurance);
}
