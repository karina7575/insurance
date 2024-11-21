package com.javacademy.insurance.contract_components;

import org.springframework.stereotype.Component;

@Component
public class ContractNumberGenerator {
    public String generate () {

        return Long.toString(1 + (long) (Math.random() * 1000000));
    }

}
