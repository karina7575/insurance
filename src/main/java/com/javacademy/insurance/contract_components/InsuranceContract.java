package com.javacademy.insurance.contract_components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * страховой договор
 */
@AllArgsConstructor
@ToString
@Getter
public class InsuranceContract {
    //номер договора
    private final String contractNumber;
    //стоимость страховки
    private BigDecimal insuranceCost;
    //сумма покрытия
    private BigDecimal coverageAmount;
    //валюта договора
    private final Currency contractCurrency;
    //ФИО клиента
    private String fio;
    //страна действия
    private Country countryOfContract;
    //тип страховки: медицинское страхование или защита от грабежа
    private InsuranceType typeOfInsurance;
    //статусы договора:  неоплаченный договор, оплаченный договор
    @Setter
    private boolean isPaid;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsuranceContract that = (InsuranceContract) o;
        return contractNumber == that.contractNumber
                && isPaid == that.isPaid
                && Objects.equals(insuranceCost, that.insuranceCost)
                && Objects.equals(coverageAmount, that.coverageAmount)
                && contractCurrency == that.contractCurrency
                && Objects.equals(fio, that.fio)
                && countryOfContract == that.countryOfContract
                && typeOfInsurance == that.typeOfInsurance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractNumber, insuranceCost, coverageAmount, contractCurrency, fio,
                countryOfContract, typeOfInsurance, isPaid);
    }
}
