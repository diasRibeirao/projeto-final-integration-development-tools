package br.com.agro.tempo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InfoInput {

	private Integer idDrone;
	private Double latitude;
	private Double longitude;
	private Integer temperatura;
	private Integer umidade;
	private Boolean rastrear;

}
