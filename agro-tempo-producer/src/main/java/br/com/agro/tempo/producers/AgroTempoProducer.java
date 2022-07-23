package br.com.agro.tempo.producers;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.agro.tempo.entity.Drone;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class AgroTempoProducer {

	@Value("${agro.tempo.name.producer}")
	private String tempoName;

	private final KafkaTemplate<String, Drone> template;

	public void enviarParaConsumer(Drone drone) {
		log.info("Enviando informações coletadas do drone: {}", drone.toString());
		template.send(tempoName, drone);
	}

	public void enviarListaParaConsumer(List<Drone> droneLista) {
		for (Drone drone : droneLista) {
			log.info("Enviando informações coletadas do drone: {}", drone.toString());
			template.send(tempoName, drone);
		}
	}
}
