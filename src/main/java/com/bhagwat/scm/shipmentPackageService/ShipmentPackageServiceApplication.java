package com.bhagwat.scm.shipmentPackageService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bhagwat.scm.observability.annotation.EnableObservability;

@SpringBootApplication
@EnableObservability
public class ShipmentPackageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipmentPackageServiceApplication.class, args);
	}

}
