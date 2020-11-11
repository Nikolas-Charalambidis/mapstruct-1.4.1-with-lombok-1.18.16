package io.nichar.samples.mapstructlombok;

public class Application {

	private static final CarMapper CAR_MAPPER = CarMapper.INSTANCE;

	public static void main(String[] args) {
		Car car = new Car("make", 4, "type");
		CarDto carDto = CAR_MAPPER.carToCarDto(car);
		System.out.println(carDto);
	}
}
