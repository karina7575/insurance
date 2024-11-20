package com.javacademy.insurance.insurance_service;

import com.javacademy.insurance.calc_services.InsuranceCalcJapanService;
import com.javacademy.insurance.contract_components.*;

import java.math.BigDecimal;

public class InsuranceServiceBrazil implements InsuranceService{
    ContractNumberGenerator generator = new ContractNumberGenerator();
    InsuranceCalcJapanService calcJapan = new InsuranceCalcJapanService();
    @Override
    public InsuranceContract dslfxfghtlkjtybz(BigDecimal coverageAmount, String fio, TypeOfInsurance typeOfInsurance) {
        return new InsuranceContract(generator.generate(),
                calcJapan.insuranceCost(coverageAmount, typeOfInsurance),
                coverageAmount,
                Currency.YEN,
                fio,
                Country.JAPAN,
                typeOfInsurance,
                false);

    }

    @Override
    public InsuranceContract insurancePayment(String contractNumber) {
        return null;
    }
}
