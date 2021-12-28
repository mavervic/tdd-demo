package com.leedcode.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.leedcode.simple.TwoSum;

public class TwoSumTest {

	@Test
	void input_2_7_11_15_target_9_return_0_1() {
		assertThat(TwoSum.excute(new int[] {2, 7, 11, 15}, 9)).isEqualTo(new int[] {0, 1});
	}
	
	@Test
	void input_3_2_4_target_6_return_1_2() {
		assertThat(TwoSum.excute(new int[] {3, 2, 4}, 6)).isEqualTo(new int[] {1, 2});
	}
	
	@Test
	void input_3_3_target_6_return_0_1() {
		assertThat(TwoSum.excute(new int[] {3, 3}, 6)).isEqualTo(new int[] {0, 1});
	}
	
	@Test
	void input_3_3_target_7_return_null() {
		assertThat(TwoSum.excute(new int[] {3, 3}, 7)).isEqualTo(null);
	}
	
	@Test
	void input_2_5_5_11_target_10_return_1_2() {
		assertThat(TwoSum.excute(new int[] {2, 5, 5, 11}, 10)).isEqualTo(new int[] {1, 2});
	}
}
