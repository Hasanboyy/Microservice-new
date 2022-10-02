package com.company.inventoryservice;

import com.company.inventoryservice.model.Inventory;
import com.company.inventoryservice.repository.InventorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner lineRunner(InventorRepository inventorRepository){
		return args -> {
			Inventory inventor  = new Inventory();
			inventor.setSkuCode("iphone_13");
			inventor.setQuantity(100);

			Inventory inventor1  = new Inventory();
			inventor1.setSkuCode("iphone_13-red");
			inventor1.setQuantity(100);


			inventorRepository.save(inventor);
			inventorRepository.save(inventor1);
		};
	}
}
