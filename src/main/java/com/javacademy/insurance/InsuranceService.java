package com.javacademy.insurance;

import com.javacademy.insurance.contract_components.InsuranceContract;
import com.javacademy.insurance.contract_components.InsuranceType;

import java.math.BigDecimal;

public interface InsuranceService {

public InsuranceContract createContract (BigDecimal coverageAmount, String fio, InsuranceType typeOfInsurance);

public InsuranceContract insurancePayment (String contractNumber);
}
