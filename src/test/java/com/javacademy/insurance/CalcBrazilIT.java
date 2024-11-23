package com.javacademy.insurance;

import com.javacademy.insurance.service.calc.InsuranceCalcBrazilService;
import com.javacademy.insurance.contract_components.InsuranceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;

@SpringBootTest
@ActiveProfiles("brazil")
public class CalcBrazilIT {

    @Autowired
    InsuranceCalcBrazilService brazilCalc;

    @Test
    public void insuranceRobberySuccess(){
        BigDecimal expected = BigDecimal.valueOf(2_800);
        BigDecimal result = brazilCalc.insuranceCost(BigDecimal.valueOf(50_000), InsuranceType.ROBBERY_PROTECTION);
        Assertions.assertTrue(expected.compareTo(result) == 0);
    }

    @Test
    public void insuranceHealthSuccess(){
        BigDecimal expected = BigDecimal.valueOf(6_800);
        BigDecimal result = brazilCalc.insuranceCost(BigDecimal.valueOf(200_000), InsuranceType.HEALTH_INSURANCE);
        Assertions.assertTrue(expected.compareTo(result) == 0);
    }
}
