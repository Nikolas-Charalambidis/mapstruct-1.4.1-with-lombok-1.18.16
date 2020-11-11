package io.nichar.samples.mapstructlombok;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarDto {

	private String make;
	private int seatCount;
	private String type;
}