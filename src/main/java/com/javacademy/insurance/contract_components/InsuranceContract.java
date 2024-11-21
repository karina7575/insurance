package com.javacademy.insurance.contract_components;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * страховой договор
 */
@AllArgsConstructor
@ToString
public class InsuranceContract {
    //номер договора
    private final long contractNumber;
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
    private boolean isPaid;

}
