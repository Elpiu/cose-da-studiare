package com.packt.cardatabase;

import com.packt.cardatabase.model.repository.CarRepository;
import com.packt.cardatabase.model.repository.OwnerRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CardatabaseApplication {
	/*
	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;
*/

	private static final Logger logger
			= LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		logger.info("#####Starting Cardatabase");
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("#####Cardatabase runned!");

	}
/*
	@Bean
	CommandLineRunner runner (){
		return args -> {
			Owner owner1 = new Owner("Elpidio","Mazza");
			Owner owner2 = new Owner("Davidone","Sapere");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);


			carRepository.save(new Car("Toyota","Supra5","Yellow","005244",2020,200005,"",null));
			carRepository.save(new Car("Seat","DiscoPanda","Black","0001112",1990,200005,"",null));
			carRepository.save(new Car("Fiat","Supra5","Blue","0044455",2002,200005,"",owner1));
			carRepository.save(new Car("Toyota","Miggo","Dark Gray","008844",1997,200005,"",null));
			carRepository.save(new Car("Motorola","Supra5","Black","0022225",2008,200005,"",owner2));

//			carRepository.findAll().forEach( ele -> logger.info(ele.toString()));
			logger.info(carRepository.findByYearIsBetweenAndPriceIsLessThanAndColor(2008,2022,90000,"Black").toString());
		};
	}*/
}
