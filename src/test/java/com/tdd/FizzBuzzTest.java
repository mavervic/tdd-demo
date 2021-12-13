package com.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	void when_number_is_2_then_print_1_2() {
		assertThat(FizzBuzzPrinter.print(2)).isEqualTo("[1, 2]");
	}

	@Test
	void when_number_is_3_print_1_2_Fizz() {
		assertThat(FizzBuzzPrinter.print(3)).isEqualTo("[1, 2, Fizz]");
	}
	
	@Test
	void when_number_is_5_print_1_2_Fizz_4_Buzz() {
		assertThat(FizzBuzzPrinter.print(5)).isEqualTo("[1, 2, Fizz, 4, Buzz]");
	}
	
}
