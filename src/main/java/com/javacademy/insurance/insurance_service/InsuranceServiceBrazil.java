package com.javacademy.insurance.insurance_service;

import com.javacademy.insurance.calc_services.InsuranceCalcBrazilService;
import com.javacademy.insurance.calc_services.InsuranceCalcJapanService;
import com.javacademy.insurance.contract_components.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class InsuranceServiceBrazil implements InsuranceService{
    ContractNumberGenerator generator = new ContractNumberGenerator();
    InsuranceCalcBrazilService calcBrazil = new InsuranceCalcBrazilService();
    @Override
    public InsuranceContract createContract(BigDecimal coverageAmount, String fio, TypeOfInsurance typeOfInsurance) {
        log.info("Делается договор...");
        InsuranceContract contract = new InsuranceContract(generator.generate(),
                calcBrazil.insuranceCost(coverageAmount, typeOfInsurance),
                coverageAmount,
                Currency.REAL,
                fio,
                Country.BRAZIL,
                typeOfInsurance,
                false);
        log.info("Договор {}", contract);
        return contract;
    }

    @Override
    public InsuranceContract insurancePayment(String contractNumber) {
        return null;
    }
}
