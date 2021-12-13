package com.tdd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FiberCalculatorTest {
	
	@Test
	void should_throw_exception_given_below_1() {
		assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(0));
		assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(-10));
	}
	
	@Test
	void should_throw_exception_given_above_50() {
		assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(51));
		assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(100));
	}
	
	@Test
	void should_return_1_given_index_1_or_2() {
		assertThat(FiberCalculator.calculate(1)).isEqualTo(1);
		assertThat(FiberCalculator.calculate(2)).isEqualTo(1);
	}
	
	@Test
	void should_return_correct_number_given_between_3_or_50() {
		assertThat(FiberCalculator.calculate(3)).isEqualTo(2);
		assertThat(FiberCalculator.calculate(5)).isEqualTo(5);
		assertThat(FiberCalculator.calculate(10)).isEqualTo(55);
	}
	
	@Test
	void should_return_12586269025_given_50() {
		assertThat(FiberCalculator.calculate(50)).isEqualTo(12586269025L);
	}
}
