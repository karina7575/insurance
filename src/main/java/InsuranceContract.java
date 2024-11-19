import java.math.BigDecimal;

/**
 * страховой договор
 */
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
    private TypeOfInsurance typeOfInsurance;
    //статусы договора:  неоплаченный договор, оплаченный договор
    private boolean isPaid;

}
