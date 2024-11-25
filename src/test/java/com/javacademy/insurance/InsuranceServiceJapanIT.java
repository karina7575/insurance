package com.javacademy.insurance;

import com.javacademy.insurance.contract_components.*;
import com.javacademy.insurance.service.calc.InsuranceCalcJapanService;
import com.javacademy.insurance.service.insurance.InsuranceServiceJapan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;

@SpringBootTest
@ActiveProfiles("japan")
public class InsuranceServiceJapanIT {

    @Autowired
    private InsuranceServiceJapan japanService;
    @MockBean
    private InsuranceCalcJapanService japanCalc;
    @SpyBean
    private Archive archive;
    @MockBean
    private ContractNumberGenerator generator;

    @Test
    public void serviceSuccess() {
        String fio = "Иванов Иван Иванович";
        InsuranceContract expected = new InsuranceContract("001", BigDecimal.valueOf(20_000), BigDecimal.valueOf(1_000_000), Currency.YEN, fio, Country.JAPAN, InsuranceType.ROBBERY_PROTECTION, false);
        Mockito.when(generator.generate()).thenReturn("001");
        Mockito.when(japanCalc.insuranceCost(BigDecimal.valueOf(1_000_000), InsuranceType.ROBBERY_PROTECTION)).thenReturn(BigDecimal.valueOf(20_000));
        InsuranceContract contract = japanService.createContract(BigDecimal.valueOf(1_000_000), fio, InsuranceType.ROBBERY_PROTECTION);
        Assertions.assertEquals(expected, contract);
    }

    @Test
    public void serviceSuccess2() {
        String fio = "Иванов Иван Иванович";
        InsuranceContract expected = new InsuranceContract("001", BigDecimal.valueOf(162_000), BigDecimal.valueOf(10_000_000), Currency.YEN, fio, Country.JAPAN, InsuranceType.ROBBERY_PROTECTION, false);
        Mockito.when(generator.generate()).thenReturn("001");
        Mockito.when(japanCalc.insuranceCost(BigDecimal.valueOf(10_000_000), InsuranceType.ROBBERY_PROTECTION)).thenReturn(BigDecimal.valueOf(162_000));
        InsuranceContract contract = japanService.createContract(BigDecimal.valueOf(10_000_000), fio, InsuranceType.ROBBERY_PROTECTION);
        Assertions.assertEquals(expected, contract);
    }

    @Test
    public void paySuccess() {
        InsuranceContract expected = new InsuranceContract("001", BigDecimal.valueOf(162_000), BigDecimal.valueOf(10_000_000), Currency.YEN, "Иванов Иван Иванович", Country.JAPAN, InsuranceType.HEALTH_INSURANCE, true);
        Mockito.when(archive.getContract("001")).thenReturn(expected);
        InsuranceContract result = japanService.insurancePayment("001");
        Assertions.assertEquals(expected, result);
    }
}
