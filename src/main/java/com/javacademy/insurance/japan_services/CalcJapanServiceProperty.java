package com.javacademy.insurance.japan_services;

import com.javacademy.insurance.contract_components.Country;
import com.javacademy.insurance.contract_components.Currency;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

@Getter
@Setter
@ConfigurationProperties(prefix = "japan")
@Profile("japan")
public class CalcJapanServiceProperty {
    private BigDecimal robberyCoefficient;
    private BigDecimal healthCoefficient;
    private Currency currency;
    private Country country;
}
