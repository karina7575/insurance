package com.javacademy.insurance;

import com.javacademy.insurance.japan_services.InsuranceServiceJapan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsuranceServiceJapanIT {

    @Autowired
    InsuranceServiceJapan japanService;


}
