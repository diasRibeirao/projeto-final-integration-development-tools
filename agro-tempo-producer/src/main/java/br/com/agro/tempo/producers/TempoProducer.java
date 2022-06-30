package br.com.agro.tempo.producers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TempoProducer {

    @Value("${agro.tempo.name.producer}")
    private String tempoName;

    private final KafkaTemplate<String, String> template;

    public void sendToTopic(String message){
        log.info("Payload enviado {}", message);
        template.send(tempoName, message);
    }

}
