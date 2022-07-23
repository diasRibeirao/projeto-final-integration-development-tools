package br.com.agro.tempo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class AgroTempoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroTempoConsumerApplication.class, args);
	}

}
