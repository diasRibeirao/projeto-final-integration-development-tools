package br.com.agro.tempo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class AgroTempoProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroTempoProducerApplication.class, args);
	}

}
