package com.javacademy.insurance.service.config;

import com.javacademy.insurance.property.CalcBrazilServiceProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("brazil")
@EnableConfigurationProperties(value = CalcBrazilServiceProperty.class)
public class CalcBrazilServiceConfig {
}
