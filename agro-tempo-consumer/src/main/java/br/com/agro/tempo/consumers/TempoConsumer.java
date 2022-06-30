package br.com.agro.tempo.consumers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.agro.tempo.entity.Drone;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TempoConsumer {

    @Value("${agro.tempo.name.consumer}")
    private String tempoName;

    @KafkaListener(topics = "${agro.tempo.name.consumer}", groupId = "group_id")
    public void consume(ConsumerRecord<String, Drone> payload){
        log.info("Tópico : {}", tempoName);
        log.info("Key : {}", payload.key());
        log.info("Headers : {}", payload.headers());
        log.info("Partition : {}", payload.partition());
        log.info("Message : {}", payload.value());
    }

}
