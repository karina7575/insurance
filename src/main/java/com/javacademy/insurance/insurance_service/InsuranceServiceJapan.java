package com.javacademy.insurance.insurance_service;

import com.javacademy.insurance.calc_services.InsuranceCalcBrazilService;
import com.javacademy.insurance.contract_components.*;

import java.math.BigDecimal;

public class InsuranceServiceJapan implements InsuranceService{
    ContractNumberGenerator generator = new ContractNumberGenerator();
    InsuranceCalcBrazilService calcBrazil = new InsuranceCalcBrazilService();
    @Override
    public InsuranceContract dslfxfghtlkjtybz(BigDecimal coverageAmount, String fio, TypeOfInsurance typeOfInsurance) {
        return new InsuranceContract(generator.generate(),
                calcBrazil.insuranceCost(coverageAmount, typeOfInsurance),
                coverageAmount,
                Currency.REAL,
                fio,
                Country.BRAZIL,
                typeOfInsurance,
                false);

    }

    @Override
    public InsuranceContract insurancePayment(String contractNumber) {
        return null;
    }
}
