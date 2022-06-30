package br.com.agro.tempo.producers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.agro.tempo.entity.Drone;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TempoProducer {

    @Value("${agro.tempo.name.producer}")
    private String tempoName;

    private final KafkaTemplate<String, Drone> template;

    public void sendToConsumer(Drone drone){
        log.info("Enviando informações coletadas do drone: {}", drone.toString());
        template.send(tempoName, drone);
    }

}
