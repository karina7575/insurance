package com.javacademy.insurance;

import com.javacademy.insurance.contract_components.InsuranceContract;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Archive {
    HashMap<String, InsuranceContract> contracts = new HashMap<String, InsuranceContract>();

    public void putContract(InsuranceContract contract) {
        contracts.put(contract.getContractNumber(), contract);
    }

    public InsuranceContract getContract(String contractNumber) {
        return contracts.get(contractNumber);
    }

}
