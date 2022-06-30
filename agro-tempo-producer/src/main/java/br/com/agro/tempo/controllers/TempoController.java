package br.com.agro.tempo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agro.tempo.producers.TempoProducer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/tempo")
public class TempoController {

    private final TempoProducer producer;

    @GetMapping(value = "/send")
    public void send() {
        producer.sendToTopic("Enviando mensagem ao kafka");
    }

}
