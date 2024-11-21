package com.javacademy.insurance.japan_services;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("japan")
@EnableConfigurationProperties(value = CalcJapanServiceProperty.class)
public class CalcJapanServiceConfig {
}
