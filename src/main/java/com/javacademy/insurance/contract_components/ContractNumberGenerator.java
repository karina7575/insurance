package com.javacademy.insurance.contract_components;

import org.springframework.stereotype.Component;

@Component
public class ContractNumberGenerator {
    public long generate () {
        return 1 + (long) (Math.random() * 1000000);
    }

}
