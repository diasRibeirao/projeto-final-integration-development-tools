package br.com.agro.tempo.consumers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.agro.tempo.entity.Drone;
import br.com.agro.tempo.utils.Contantes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class AgroTempoConsumer {

	@Value("${agro.tempo.name.consumer}")
	private String tempoName;
	
	@KafkaListener(topics = "${agro.tempo.name.consumer}", groupId = "group_id")
	public void consumer(ConsumerRecord<String, Drone> payload) {
		log.info("Recebendo dados: {}", payload.value());
		
		if (!validaDados(payload.value())) {
			// Aqui numa aplicação real, seria enviado um e-mail.
			// Com banco de dados, neste ponto poderiamos inserir em uma tabela para envio de e-mail numa thread
			// Ou poderiamos colocar em uma fila de envio de e-mail
			log.warn("CONSUMER: Os dados do drone " + payload.value().getId() + " estão fora dos padrões.");
			log.warn("Temperatura informada: " + payload.value().getTemperatura());
			log.warn("Temperatura esperada: entre " + Contantes.TEMPERATURA_MIN + " e " + Contantes.TEMPERATURA_MAX);
			log.warn("Umidade informada: " + payload.value().getUmidade());
			log.warn("Umidade mínima esperada: " + Contantes.UMIDADE);
		}
		
	}
		
	private Boolean validaDados(Drone drone) {
		return drone.getTemperatura() >= Contantes.TEMPERATURA_MIN &&
			   drone.getTemperatura() <= Contantes.TEMPERATURA_MAX && 
			   drone.getUmidade() >= Contantes.UMIDADE;
	}

}
