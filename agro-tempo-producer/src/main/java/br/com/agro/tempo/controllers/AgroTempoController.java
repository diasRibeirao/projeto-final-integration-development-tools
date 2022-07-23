package br.com.agro.tempo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agro.tempo.entity.Drone;
import br.com.agro.tempo.producers.AgroTempoProducer;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/enviar")
@Tag(name = "AgroTempo")
public class AgroTempoController {

	private final AgroTempoProducer producer;

	@PostMapping
	public void enviar(@RequestBody Drone drone) {
		producer.enviarParaConsumer(drone);
	}

	@PostMapping(value = "/lista")
	public void enviarLista(@RequestBody List<Drone> droneLista) {
		producer.enviarListaParaConsumer(droneLista);
	}

}
