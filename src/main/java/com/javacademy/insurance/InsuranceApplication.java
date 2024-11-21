package com.javacademy.insurance;

import com.javacademy.insurance.contract_components.InsuranceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class InsuranceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(InsuranceApplication.class, args);
		InsuranceService service = context.getBean(InsuranceService.class);
		service.createContract(BigDecimal.valueOf(300_000), "Иванов Иван Иванович", InsuranceType.HEALTH_INSURANCE);
	}

}
