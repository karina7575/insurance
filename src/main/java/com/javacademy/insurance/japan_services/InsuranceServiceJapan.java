package com.javacademy.insurance.japan_services;

import com.javacademy.insurance.InsuranceService;
import com.javacademy.insurance.contract_components.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
@RequiredArgsConstructor
@Profile("japan")
public class InsuranceServiceJapan implements InsuranceService {
    private final ContractNumberGenerator generator;
    private final InsuranceCalcJapanService calcJapan;

    @Override
    public InsuranceContract createContract(BigDecimal coverageAmount, String fio, InsuranceType typeOfInsurance) {
        InsuranceContract contract = new InsuranceContract(generator.generate(),
                calcJapan.insuranceCost(coverageAmount, typeOfInsurance),
                coverageAmount,
                Currency.YEN,
                fio,
                Country.JAPAN,
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
