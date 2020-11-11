package io.nichar.samples.mapstructlombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarMapperTest {

	private final CarMapper carMapper = CarMapper.INSTANCE;

	@Test
	void test() {
		Car car = new Car("make", 4, "type");
		CarDto carDto = carMapper.carToCarDto(car);

		Assertions.assertEquals("make", carDto.getMake());
		Assertions.assertEquals(4, carDto.getSeatCount());
		Assertions.assertEquals("type", carDto.getType());

		System.out.println(carDto);
	}
}