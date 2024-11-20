package com.javacademy.insurance.contract_components;

import org.springframework.stereotype.Component;

@Component
public class ContractNumberGenerator {
    public long generate () {
        return (long) Math.random();
    }

}
