package br.com.agro.tempo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agro.tempo.entity.Drone;
import br.com.agro.tempo.producers.TempoProducer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/tempo")
public class TempoController {

	private final TempoProducer producer;

	@PostMapping(value = "/send")
	public void send(@RequestBody Drone drone) {
		producer.sendToConsumer(drone);
	}

}
