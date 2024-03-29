package MoreAndMore.ForHalogen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AutoConfigurationPackage
@SpringBootApplication(scanBasePackages = "MoreAndMore.ForHalogen")
public class ForHalogenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForHalogenApplication.class, args);
	}

}
