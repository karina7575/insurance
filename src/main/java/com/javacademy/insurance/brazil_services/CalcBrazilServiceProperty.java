package com.javacademy.insurance.brazil_services;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

@Getter
@Setter
@ConfigurationProperties(prefix = "brazil")
@Profile("brazil")
public class CalcBrazilServiceProperty {
    private BigDecimal robberyCoefficient;
    private BigDecimal healthCoefficient;
}
