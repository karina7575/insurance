package com.javacademy.insurance.contract_components;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * страховой договор
 */
@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
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
}
