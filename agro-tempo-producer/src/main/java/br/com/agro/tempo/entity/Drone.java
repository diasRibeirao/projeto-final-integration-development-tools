package br.com.agro.tempo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Drone {

	private Long id;
	private Double latitude = Double.MIN_VALUE;
    private Double longitude = Double.MIN_VALUE;
    private Double temperatura = Double.MIN_VALUE;
    private Double umidade = Double.MIN_VALUE;
	private Boolean rastrear;
	
	
}
