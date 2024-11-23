package com.javacademy.insurance.service.insurance;

import com.javacademy.insurance.Archive;
import com.javacademy.insurance.property.CalcBrazilServiceProperty;
import com.javacademy.insurance.contract_components.ContractNumberGenerator;
import com.javacademy.insurance.contract_components.InsuranceContract;
import com.javacademy.insurance.contract_components.InsuranceType;
import com.javacademy.insurance.InsuranceService;
import com.javacademy.insurance.service.calc.InsuranceCalcBrazilService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Slf4j
@Component
@RequiredArgsConstructor
@Profile("brazil")
public class InsuranceServiceBrazil implements InsuranceService {
    private final ContractNumberGenerator generator;
    private final InsuranceCalcBrazilService calcBrazil;
    private Archive archive;
    private final CalcBrazilServiceProperty property;

    @Override
    public InsuranceContract createContract(BigDecimal coverageAmount, String fio, InsuranceType typeOfInsurance) {
        InsuranceContract contract = new InsuranceContract(generator.generate(),
                calcBrazil.insuranceCost(coverageAmount, typeOfInsurance),
                coverageAmount,
                property.getCurrency(),
                fio,
                property.getCountry(),
                typeOfInsurance,
                false);
        archive.putContract(contract);
        return contract;
    }

    @Override
    public InsuranceContract insurancePayment(String contractNumber) {
        InsuranceContract contract = archive.getContract(contractNumber);
        contract.setPaid(true);
        return contract;
    }
}
