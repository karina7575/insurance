package com.javacademy.insurance;

import com.javacademy.insurance.contract_components.InsuranceType;
import com.javacademy.insurance.japan_services.InsuranceCalcJapanService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class CalcJapanIT {

    @Autowired
    InsuranceCalcJapanService japanCalc;

    @Test
    public void insuranceRobberySuccess(){
        BigDecimal expected = BigDecimal.valueOf(20_000);
        BigDecimal result = japanCalc.insuranceCost(BigDecimal.valueOf(1_000_000), InsuranceType.ROBBERY_PROTECTION);
        Assertions.assertTrue(expected.compareTo(result) == 0);
    }

    @Test
    public void insuranceHealthSuccess(){
        BigDecimal expected = BigDecimal.valueOf(162_000);
        BigDecimal result = japanCalc.insuranceCost(BigDecimal.valueOf(10_000_000), InsuranceType.HEALTH_INSURANCE);
        Assertions.assertTrue(expected.compareTo(result) == 0);
    }
}
