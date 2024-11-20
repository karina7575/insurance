package com.javacademy.insurance.calc_services;

import com.javacademy.insurance.contract_components.TypeOfInsurance;

import java.math.BigDecimal;

public interface InsuranceCalcService {

    public BigDecimal insuranceCost(BigDecimal coverageAmount, TypeOfInsurance typeOfInsurance);
}
